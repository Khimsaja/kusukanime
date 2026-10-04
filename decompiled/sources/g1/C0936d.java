package g1;

import android.util.Base64;
import java.util.List;

/* renamed from: g1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0936d {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11675b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11676c;

    /* renamed from: d, reason: collision with root package name */
    public final List f11677d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11678e;

    public C0936d(String str, String str2, String str3, List list) {
        str.getClass();
        this.a = str;
        str2.getClass();
        this.f11675b = str2;
        this.f11676c = str3;
        list.getClass();
        this.f11677d = list;
        this.f11678e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.a + ", mProviderPackage: " + this.f11675b + ", mQuery: " + this.f11676c + ", mCertificates:");
        int i7 = 0;
        while (true) {
            List list = this.f11677d;
            if (i7 >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i7);
            for (int i8 = 0; i8 < list2.size(); i8++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i8), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i7++;
        }
    }
}
