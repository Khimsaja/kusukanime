package N1;

import b1.AbstractC0703b;
import f2.C0874b;
import i2.C1069a;
import j2.h;
import l2.C1411c;
import y1.C2393o;
import z1.c;

/* loaded from: classes.dex */
public final class a {
    public static final a a = new a();

    public final c a(C2393o c2393o) {
        String str = c2393o.f18112n;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new C0874b(0);
                case "application/x-icy":
                    return new C1069a();
                case "application/id3":
                    return new h(null);
                case "application/x-emsg":
                    return new C0874b(1);
                case "application/x-scte35":
                    return new C1411c();
            }
        }
        throw new IllegalArgumentException(AbstractC0703b.i("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final boolean b(C2393o c2393o) {
        String str = c2393o.f18112n;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
