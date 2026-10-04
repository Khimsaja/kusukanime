package F2;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class G implements p1.l {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2261k;

    /* renamed from: l, reason: collision with root package name */
    public String f2262l;

    public static G d(B1.B b4) {
        String str;
        b4.G(2);
        int iT = b4.t();
        int i7 = iT >> 1;
        int iT2 = ((b4.t() >> 3) & 31) | ((iT & 1) << 5);
        if (i7 == 4 || i7 == 5 || i7 == 7 || i7 == 8) {
            str = "dvhe";
        } else if (i7 == 9) {
            str = "dvav";
        } else {
            if (i7 != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i7 < 10 ? ".0" : ".");
        sb.append(i7);
        sb.append(iT2 < 10 ? ".0" : ".");
        sb.append(iT2);
        return new G(sb.toString(), 2);
    }

    public void b(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f2262l);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }

    @Override // p1.l
    public boolean c(CharSequence charSequence, int i7, int i8, p1.q qVar) {
        if (!TextUtils.equals(charSequence.subSequence(i7, i8), this.f2262l)) {
            return true;
        }
        qVar.f14195c = (qVar.f14195c & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.f2261k) {
            case 1:
                return A6.b.j(new StringBuilder("<"), this.f2262l, '>');
            case 6:
                return this.f2262l;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ G(String str, int i7) {
        this.f2261k = i7;
        this.f2262l = str;
    }

    public G(String str) {
        this.f2261k = 4;
        str.getClass();
        this.f2262l = str;
    }

    @Override // p1.l
    public Object a() {
        return this;
    }
}
