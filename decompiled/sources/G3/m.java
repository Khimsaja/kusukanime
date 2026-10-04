package G3;

import java.io.Closeable;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class m implements Closeable {

    /* renamed from: k, reason: collision with root package name */
    public int f2806k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f2807l;

    /* renamed from: m, reason: collision with root package name */
    public String[] f2808m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f2809n;

    public abstract String H();

    public abstract int J();

    public final void L(int i7) {
        int i8 = this.f2806k;
        int[] iArr = this.f2807l;
        if (i8 == iArr.length) {
            if (i8 == 256) {
                throw new D6.r("Nesting too deep at " + j());
            }
            this.f2807l = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f2808m;
            this.f2808m = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f2809n;
            this.f2809n = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f2807l;
        int i9 = this.f2806k;
        this.f2806k = i9 + 1;
        iArr3[i9] = i7;
    }

    public abstract int O(F.w wVar);

    public abstract void P();

    public abstract void T();

    public final void W(String str) throws D1.a {
        throw new D1.a(str + " at path " + j());
    }

    public abstract void b();

    public abstract void e();

    public abstract void g();

    public abstract void i();

    public final String j() {
        return C.c(this.f2806k, this.f2807l, this.f2808m, this.f2809n);
    }

    public abstract boolean m();

    public abstract double s();

    public abstract int v();

    public abstract void x();
}
