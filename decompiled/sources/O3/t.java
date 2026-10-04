package O3;

import P3.AbstractC0564e;
import Z5.C0656z;
import android.view.View;
import android.view.ViewGroup;
import f4.InterfaceC0881a;
import io.ktor.util.GzipHeaderFlags;
import java.util.Iterator;
import java.util.NoSuchElementException;
import m.C1478H;

/* loaded from: classes.dex */
public class t implements Iterator, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7542k;

    /* renamed from: l, reason: collision with root package name */
    public int f7543l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f7544m;

    public /* synthetic */ t(int i7, Object obj) {
        this.f7542k = i7;
        this.f7544m = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f7542k) {
            case 0:
                if (this.f7543l < ((byte[]) this.f7544m).length) {
                }
                break;
            case 1:
                if (this.f7543l < ((int[]) this.f7544m).length) {
                }
                break;
            case 2:
                if (this.f7543l < ((long[]) this.f7544m).length) {
                }
                break;
            case 3:
                if (this.f7543l < ((short[]) this.f7544m).length) {
                }
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                if (this.f7543l < ((AbstractC0564e) this.f7544m).a()) {
                }
                break;
            case 5:
                if (this.f7543l > 0) {
                }
                break;
            case 6:
                if (this.f7543l < ((ViewGroup) this.f7544m).getChildCount()) {
                }
                break;
            case 7:
                if (this.f7543l < ((Object[]) this.f7544m).length) {
                }
                break;
            default:
                if (this.f7543l < ((C1478H) this.f7544m).e()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f7542k) {
            case 0:
                int i7 = this.f7543l;
                byte[] bArr = (byte[]) this.f7544m;
                if (i7 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f7543l));
                }
                this.f7543l = i7 + 1;
                return new s(bArr[i7]);
            case 1:
                int i8 = this.f7543l;
                int[] iArr = (int[]) this.f7544m;
                if (i8 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f7543l));
                }
                this.f7543l = i8 + 1;
                return new v(iArr[i8]);
            case 2:
                int i9 = this.f7543l;
                long[] jArr = (long[]) this.f7544m;
                if (i9 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f7543l));
                }
                this.f7543l = i9 + 1;
                return new x(jArr[i9]);
            case 3:
                int i10 = this.f7543l;
                short[] sArr = (short[]) this.f7544m;
                if (i10 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f7543l));
                }
                this.f7543l = i10 + 1;
                return new A(sArr[i10]);
            case GzipHeaderFlags.EXTRA /* 4 */:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i11 = this.f7543l;
                this.f7543l = i11 + 1;
                return ((AbstractC0564e) this.f7544m).get(i11);
            case 5:
                C0656z c0656z = (C0656z) this.f7544m;
                int i12 = this.f7543l;
                this.f7543l = i12 - 1;
                return c0656z.f10330e[c0656z.f10328c - i12];
            case 6:
                int i13 = this.f7543l;
                this.f7543l = i13 + 1;
                View childAt = ((ViewGroup) this.f7544m).getChildAt(i13);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
            case 7:
                try {
                    Object[] objArr = (Object[]) this.f7544m;
                    int i14 = this.f7543l;
                    this.f7543l = i14 + 1;
                    return objArr[i14];
                } catch (ArrayIndexOutOfBoundsException e7) {
                    this.f7543l--;
                    throw new NoSuchElementException(e7.getMessage());
                }
            default:
                int i15 = this.f7543l;
                this.f7543l = i15 + 1;
                return ((C1478H) this.f7544m).f(i15);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f7542k) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case GzipHeaderFlags.EXTRA /* 4 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 6:
                int i7 = this.f7543l - 1;
                this.f7543l = i7;
                ((ViewGroup) this.f7544m).removeViewAt(i7);
                return;
            case 7:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public t(Object[] objArr) {
        this.f7542k = 7;
        kotlin.jvm.internal.l.f("array", objArr);
        this.f7544m = objArr;
    }

    public t(C0656z c0656z) {
        this.f7542k = 5;
        this.f7544m = c0656z;
        this.f7543l = c0656z.f10328c;
    }
}
