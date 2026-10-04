package B1;

import H.C0197n;
import b1.AbstractC0703b;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class s {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public int f358b;

    /* renamed from: c, reason: collision with root package name */
    public int f359c;

    /* renamed from: d, reason: collision with root package name */
    public int f360d;

    /* renamed from: e, reason: collision with root package name */
    public Object f361e;

    public /* synthetic */ s(int i7) {
        this.a = i7;
    }

    public void a(G3.t tVar) {
        tVar.f2840m = null;
        tVar.f2838k = null;
        tVar.f2839l = null;
        tVar.f2846s = 1;
        int i7 = this.f358b;
        if (i7 > 0) {
            int i8 = this.f360d;
            if ((i8 & 1) == 0) {
                this.f360d = i8 + 1;
                this.f358b = i7 - 1;
                this.f359c++;
            }
        }
        tVar.f2838k = (G3.t) this.f361e;
        this.f361e = tVar;
        int i9 = this.f360d;
        int i10 = i9 + 1;
        this.f360d = i10;
        int i11 = this.f358b;
        if (i11 > 0 && (i10 & 1) == 0) {
            this.f360d = i9 + 2;
            this.f358b = i11 - 1;
            this.f359c++;
        }
        int i12 = 4;
        while (true) {
            int i13 = i12 - 1;
            if ((this.f360d & i13) != i13) {
                return;
            }
            int i14 = this.f359c;
            if (i14 == 0) {
                G3.t tVar2 = (G3.t) this.f361e;
                G3.t tVar3 = tVar2.f2838k;
                G3.t tVar4 = tVar3.f2838k;
                tVar3.f2838k = tVar4.f2838k;
                this.f361e = tVar3;
                tVar3.f2839l = tVar4;
                tVar3.f2840m = tVar2;
                tVar3.f2846s = tVar2.f2846s + 1;
                tVar4.f2838k = tVar3;
                tVar2.f2838k = tVar3;
            } else if (i14 == 1) {
                G3.t tVar5 = (G3.t) this.f361e;
                G3.t tVar6 = tVar5.f2838k;
                this.f361e = tVar6;
                tVar6.f2840m = tVar5;
                tVar6.f2846s = tVar5.f2846s + 1;
                tVar5.f2838k = tVar6;
                this.f359c = 0;
            } else if (i14 == 2) {
                this.f359c = 0;
            }
            i12 *= 2;
        }
    }

    public C0197n b(int i7) {
        return new C0197n(n6.m.O((H0.F) this.f361e, i7), i7, 1L);
    }

    public int c() {
        return this.f360d - this.f359c;
    }

    public int d(int i7) {
        return ((P.D) this.f361e).f7645k[this.f359c + i7];
    }

    public Object e(int i7) {
        return ((P.D) this.f361e).f7647m[this.f360d + i7];
    }

    public long f() {
        int i7 = this.f359c;
        if (i7 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = (long[]) this.f361e;
        int i8 = this.f358b;
        long j7 = jArr[i8];
        this.f358b = this.f360d & (i8 + 1);
        this.f359c = i7 - 1;
        return j7;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
                int i7 = this.f358b;
                sb.append(i7);
                sb.append('-');
                H0.F f5 = (H0.F) this.f361e;
                sb.append(n6.m.O(f5, i7));
                sb.append(',');
                int i8 = this.f359c;
                sb.append(i8);
                sb.append('-');
                sb.append(n6.m.O(f5, i8));
                sb.append("), prevOffset=");
                return AbstractC0703b.l(sb, this.f360d, ')');
            case 3:
                return "";
            default:
                return super.toString();
        }
    }

    public s(P.D d4) {
        this.a = 4;
        this.f361e = d4;
    }

    public s(int i7, int i8, int i9, H0.F f5) {
        this.a = 2;
        this.f358b = i7;
        this.f359c = i8;
        this.f360d = i9;
        this.f361e = f5;
    }
}
