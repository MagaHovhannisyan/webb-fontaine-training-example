package information.networking;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Url {
    public static void main(String[] args) {
        downloadImage();
//        {
//            try {
//                URL url = new URL("https://www.youtube.com/results?search_query=elegant");
//                System.out.println("url.getProtocol() = " + url.getProtocol()); //https
//                System.out.println("url.getHost() = " + url.getHost()); // www.youtube.com
//                System.out.println("url.getFile() = " + url.getFile()); // /results?search_query=elegant
//                System.out.println("url.getPath() = " + url.getPath()); // /results, separated with /
//                System.out.println("url.getQuery() = " + url.getQuery()); // search_query=elegant , separated with ?
//                System.out.println("url.getPort() = " + url.getPort()); // -1 as this case has no port, usually used
//                // when running locally, always returns numeric value
//            } catch (MalformedURLException e) {
//                e.printStackTrace();
//            }
//        }
    }

    private static void sendGET() {
        HttpURLConnection connection = null;
        InputStream is = null;
        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/posts/1");
            connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

            //optional
            connection.setRequestProperty("Content-Type", "");

            connection.connect();

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                is = connection.getInputStream();
                int read;
                while ((read = is.read()) != -1) {
                    System.out.print((char) read);
                }
            } else {
                System.out.println("responseCode = " + responseCode);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void sendPOST() {
        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/posts");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("POST");

            //optional
            connection.setRequestProperty("Content-Type", "");

            connection.setDoOutput(true); // Important not to forget!

            OutputStream os = connection.getOutputStream();
            String body = "{\n" +
                    "    \"userId\": 6688,\n" +
                    "    \"title\": \"sunt aut facere repellat provident occaecati excepturi optio reprehenderit\",\n" +
                    "    \"body\": \"quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto\"\n" +
                    "  }";
            os.write(body.getBytes());
            os.flush();

            int code = connection.getResponseCode();
            System.out.println("code = " + code);

            InputStream is = connection.getInputStream();
            int read;
            while ((read = is.read()) != -1) {
                System.out.print((char) read);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void downloadImage() {
        try {
            URL url = new URL("https://image.shutterstock.com/image-photo/white-transparent-leaf-on-mirror-600w-1029171697.jpg");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            InputStream is = connection.getInputStream(); // in order to read
            FileOutputStream fout = new FileOutputStream("my_image.jpg"); // in order to write
            int read;
            while ((read = is.read()) != -1) {
                fout.write(read);
            }

            //OR other solution, used when working with large files
            BufferedInputStream bis = new BufferedInputStream(is);
            byte[] buffer = new byte[1024];
            while ((read = bis.read(buffer, 0, buffer.length)) != -1) {
                fout.write(buffer, 0, read);
            }

            fout.flush();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}