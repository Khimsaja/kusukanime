package i3;

/* renamed from: i3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1073b extends AbstractC1072a {

    /* renamed from: k, reason: collision with root package name */
    public final char f12005k;

    public C1073b(char c2) {
        this.f12005k = c2;
    }

    @Override // i3.AbstractC1072a
    public final boolean a(char c2) {
        return c2 == this.f12005k;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.is('");
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        char c2 = this.f12005k;
        for (int i7 = 0; i7 < 4; i7++) {
            cArr[5 - i7] = "0123456789ABCDEF".charAt(c2 & 15);
            c2 = (char) (c2 >> 4);
        }
        sb.append(String.copyValueOf(cArr));
        sb.append("')");
        return sb.toString();
    }
}
