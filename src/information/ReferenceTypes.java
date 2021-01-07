package information;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class ReferenceTypes {
    // STRONG REFERENCE - GC will clear it only when x will refer to null
    String x = new String("xxx");

    // SOFT REFERENCE - cleared at the discretion of the GC in response to memory demand, no matter if there is reference or not (i.e. Android)
    SoftReference<String> x1 = new SoftReference<String>("sss");

    // WEAK REFERENCE - cleared at the discretion of the GC no matter if there is memory demand or reference
    WeakReference<String> x2 = new WeakReference<>("www");

    // PHANTOM REFERENCE - almost not used
}
