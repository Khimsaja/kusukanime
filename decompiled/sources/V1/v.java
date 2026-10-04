package V1;

import B1.K;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f9417c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f9418b = -1;

    public final boolean a(String str) throws NumberFormatException {
        Matcher matcher = f9417c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i7 = K.a;
            int i8 = Integer.parseInt(strGroup, 16);
            int i9 = Integer.parseInt(matcher.group(2), 16);
            if (i8 <= 0 && i9 <= 0) {
                return false;
            }
            this.a = i8;
            this.f9418b = i9;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(y1.C c2) {
        int i7 = 0;
        while (true) {
            y1.B[] bArr = c2.a;
            if (i7 >= bArr.length) {
                return;
            }
            y1.B b4 = bArr[i7];
            if (b4 instanceof j2.e) {
                j2.e eVar = (j2.e) b4;
                if ("iTunSMPB".equals(eVar.f12242c) && a(eVar.f12243d)) {
                    return;
                }
            } else if (b4 instanceof j2.k) {
                j2.k kVar = (j2.k) b4;
                if ("com.apple.iTunes".equals(kVar.f12252b) && "iTunSMPB".equals(kVar.f12253c) && a(kVar.f12254d)) {
                    return;
                }
            } else {
                continue;
            }
            i7++;
        }
    }
}
