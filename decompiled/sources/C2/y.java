package C2;

import B1.AbstractC0015b;
import H1.d0;
import K2.AbstractC0319x;
import android.view.View;
import b1.AbstractC0703b;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class y {
    public final /* synthetic */ int a = 2;

    /* renamed from: b, reason: collision with root package name */
    public boolean f936b;

    /* renamed from: c, reason: collision with root package name */
    public int f937c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f938d;

    /* renamed from: e, reason: collision with root package name */
    public int f939e;

    /* renamed from: f, reason: collision with root package name */
    public Object f940f;

    public y(int i7) {
        this.f937c = i7;
        byte[] bArr = new byte[131];
        this.f940f = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i7, int i8) {
        if (this.f936b) {
            int i9 = i8 - i7;
            byte[] bArr2 = (byte[]) this.f940f;
            int length = bArr2.length;
            int i10 = this.f939e;
            if (length < i10 + i9) {
                this.f940f = Arrays.copyOf(bArr2, (i10 + i9) * 2);
            }
            System.arraycopy(bArr, i7, (byte[]) this.f940f, this.f939e, i9);
            this.f939e += i9;
        }
    }

    public void b() {
        this.f939e = this.f936b ? ((AbstractC0319x) this.f940f).g() : ((AbstractC0319x) this.f940f).k();
    }

    public void c(View view, int i7) {
        if (this.f936b) {
            int iB = ((AbstractC0319x) this.f940f).b(view);
            AbstractC0319x abstractC0319x = (AbstractC0319x) this.f940f;
            this.f939e = (Integer.MIN_VALUE == abstractC0319x.a ? 0 : abstractC0319x.l() - abstractC0319x.a) + iB;
        } else {
            this.f939e = ((AbstractC0319x) this.f940f).e(view);
        }
        this.f937c = i7;
    }

    public void d(View view, int i7) {
        AbstractC0319x abstractC0319x = (AbstractC0319x) this.f940f;
        int iL = Integer.MIN_VALUE == abstractC0319x.a ? 0 : abstractC0319x.l() - abstractC0319x.a;
        if (iL >= 0) {
            c(view, i7);
            return;
        }
        this.f937c = i7;
        if (!this.f936b) {
            int iE = ((AbstractC0319x) this.f940f).e(view);
            int iK = iE - ((AbstractC0319x) this.f940f).k();
            this.f939e = iE;
            if (iK > 0) {
                int iG = (((AbstractC0319x) this.f940f).g() - Math.min(0, (((AbstractC0319x) this.f940f).g() - iL) - ((AbstractC0319x) this.f940f).b(view))) - (((AbstractC0319x) this.f940f).c(view) + iE);
                if (iG < 0) {
                    this.f939e -= Math.min(iK, -iG);
                    return;
                }
                return;
            }
            return;
        }
        int iG2 = (((AbstractC0319x) this.f940f).g() - iL) - ((AbstractC0319x) this.f940f).b(view);
        this.f939e = ((AbstractC0319x) this.f940f).g() - iG2;
        if (iG2 > 0) {
            int iC = this.f939e - ((AbstractC0319x) this.f940f).c(view);
            int iK2 = ((AbstractC0319x) this.f940f).k();
            int iMin = iC - (Math.min(((AbstractC0319x) this.f940f).e(view) - iK2, 0) + iK2);
            if (iMin < 0) {
                this.f939e = Math.min(iG2, -iMin) + this.f939e;
            }
        }
    }

    public boolean e(int i7) {
        if (!this.f936b) {
            return false;
        }
        this.f939e -= i7;
        this.f936b = false;
        this.f938d = true;
        return true;
    }

    public void f(int i7) {
        this.f936b |= i7 > 0;
        this.f937c += i7;
    }

    public void g() {
        switch (this.a) {
            case 0:
                this.f936b = false;
                this.f938d = false;
                break;
            default:
                this.f937c = -1;
                this.f939e = Integer.MIN_VALUE;
                this.f936b = false;
                this.f938d = false;
                break;
        }
    }

    public void h(int i7) {
        AbstractC0015b.h(!this.f936b);
        boolean z7 = i7 == this.f937c;
        this.f936b = z7;
        if (z7) {
            this.f939e = 3;
            this.f938d = false;
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
                sb.append(this.f937c);
                sb.append(", mCoordinate=");
                sb.append(this.f939e);
                sb.append(", mLayoutFromEnd=");
                sb.append(this.f936b);
                sb.append(", mValid=");
                return AbstractC0703b.n(sb, this.f938d, '}');
            default:
                return super.toString();
        }
    }

    public y(d0 d0Var) {
        this.f940f = d0Var;
    }

    public y() {
        g();
    }
}
