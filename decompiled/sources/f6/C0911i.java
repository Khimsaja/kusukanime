package f6;

import java.util.Comparator;

/* renamed from: f6.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0911i implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        kotlin.jvm.internal.l.f("a", str);
        kotlin.jvm.internal.l.f("b", str2);
        int iMin = Math.min(str.length(), str2.length());
        for (int i7 = 4; i7 < iMin; i7++) {
            char cCharAt = str.charAt(i7);
            char cCharAt2 = str2.charAt(i7);
            if (cCharAt != cCharAt2) {
                return kotlin.jvm.internal.l.g(cCharAt, cCharAt2) < 0 ? -1 : 1;
            }
        }
        int length = str.length();
        int length2 = str2.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }
}
