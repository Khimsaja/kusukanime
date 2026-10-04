package G2;

import android.os.Bundle;
import f6.AbstractC0915m;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public final class K extends M {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2677e;

    public K(boolean z7, int i7) {
        this.f2677e = i7;
    }

    @Override // G2.M
    public final Object a(String str, Bundle bundle) {
        switch (this.f2677e) {
            case 0:
                return (Boolean) A6.b.c(bundle, "bundle", str, "key", str);
            case 1:
                Object objC = A6.b.c(bundle, "bundle", str, "key", str);
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Int", objC);
                return (Integer) objC;
            case 2:
                Object objC2 = A6.b.c(bundle, "bundle", str, "key", str);
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Long", objC2);
                return (Long) objC2;
            default:
                return (String) A6.b.c(bundle, "bundle", str, "key", str);
        }
    }

    @Override // G2.M
    public final String b() {
        switch (this.f2677e) {
            case 0:
                return "boolean";
            case 1:
                return "integer";
            case 2:
                return "long";
            default:
                return "string";
        }
    }

    @Override // G2.M
    public final Object c(String str) throws NumberFormatException {
        boolean z7;
        int i7;
        String strSubstring;
        long j7;
        switch (this.f2677e) {
            case 0:
                if (str.equals("true")) {
                    z7 = true;
                } else {
                    if (!str.equals("false")) {
                        throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                    }
                    z7 = false;
                }
                return Boolean.valueOf(z7);
            case 1:
                if (AbstractC2517v.T(str, "0x", false)) {
                    String strSubstring2 = str.substring(2);
                    kotlin.jvm.internal.l.e("substring(...)", strSubstring2);
                    AbstractC0915m.k(16);
                    i7 = Integer.parseInt(strSubstring2, 16);
                } else {
                    i7 = Integer.parseInt(str);
                }
                return Integer.valueOf(i7);
            case 2:
                if (AbstractC2517v.L(str, "L", false)) {
                    strSubstring = str.substring(0, str.length() - 1);
                    kotlin.jvm.internal.l.e("substring(...)", strSubstring);
                } else {
                    strSubstring = str;
                }
                if (AbstractC2517v.T(str, "0x", false)) {
                    String strSubstring3 = strSubstring.substring(2);
                    kotlin.jvm.internal.l.e("substring(...)", strSubstring3);
                    AbstractC0915m.k(16);
                    j7 = Long.parseLong(strSubstring3, 16);
                } else {
                    j7 = Long.parseLong(strSubstring);
                }
                return Long.valueOf(j7);
            default:
                if (str.equals("null")) {
                    return null;
                }
                return str;
        }
    }

    @Override // G2.M
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.f2677e) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                kotlin.jvm.internal.l.f("key", str);
                bundle.putBoolean(str, zBooleanValue);
                break;
            case 1:
                int iIntValue = ((Number) obj).intValue();
                kotlin.jvm.internal.l.f("key", str);
                bundle.putInt(str, iIntValue);
                break;
            case 2:
                long jLongValue = ((Number) obj).longValue();
                kotlin.jvm.internal.l.f("key", str);
                bundle.putLong(str, jLongValue);
                break;
            default:
                kotlin.jvm.internal.l.f("key", str);
                bundle.putString(str, (String) obj);
                break;
        }
    }
}
