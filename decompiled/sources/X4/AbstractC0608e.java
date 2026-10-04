package X4;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Stack;

/* renamed from: X4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0608e implements Iterable {

    /* renamed from: k, reason: collision with root package name */
    public static final v f9883k = new v(new byte[0]);

    public static AbstractC0608e a(Iterator it, int i7) {
        if (i7 == 1) {
            return (AbstractC0608e) it.next();
        }
        int i8 = i7 >>> 1;
        return a(it, i8).h(a(it, i7 - i8));
    }

    public static C0607d r() {
        return new C0607d();
    }

    public final AbstractC0608e h(AbstractC0608e abstractC0608e) {
        int size = size();
        int size2 = abstractC0608e.size();
        if (size + size2 >= 2147483647L) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(size);
            sb.append("+");
            sb.append(size2);
            throw new IllegalArgumentException(sb.toString());
        }
        int[] iArr = B.f9831r;
        B b4 = this instanceof B ? (B) this : null;
        if (abstractC0608e.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return abstractC0608e;
        }
        int size3 = abstractC0608e.size() + size();
        if (size3 < 128) {
            int size4 = size();
            int size5 = abstractC0608e.size();
            byte[] bArr = new byte[size4 + size5];
            j(0, 0, size4, bArr);
            abstractC0608e.j(0, size4, size5, bArr);
            return new v(bArr);
        }
        if (b4 != null) {
            AbstractC0608e abstractC0608e2 = b4.f9834n;
            if (abstractC0608e.size() + abstractC0608e2.size() < 128) {
                int size6 = abstractC0608e2.size();
                int size7 = abstractC0608e.size();
                byte[] bArr2 = new byte[size6 + size7];
                abstractC0608e2.j(0, 0, size6, bArr2);
                abstractC0608e.j(0, size6, size7, bArr2);
                return new B(b4.f9833m, new v(bArr2));
            }
        }
        if (b4 != null) {
            AbstractC0608e abstractC0608e3 = b4.f9833m;
            int iO = abstractC0608e3.o();
            AbstractC0608e abstractC0608e4 = b4.f9834n;
            if (iO > abstractC0608e4.o()) {
                if (b4.f9836p > abstractC0608e.o()) {
                    return new B(abstractC0608e3, new B(abstractC0608e4, abstractC0608e));
                }
            }
        }
        if (size3 >= B.f9831r[Math.max(o(), abstractC0608e.o()) + 1]) {
            return new B(this, abstractC0608e);
        }
        y yVar = new y(0);
        yVar.t(this);
        yVar.t(abstractC0608e);
        Stack stack = (Stack) yVar.f9916l;
        AbstractC0608e b7 = (AbstractC0608e) stack.pop();
        while (!stack.isEmpty()) {
            b7 = new B((AbstractC0608e) stack.pop(), b7);
        }
        return b7;
    }

    public final void j(int i7, int i8, int i9, byte[] bArr) {
        if (i7 < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i7);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i8 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Target offset < 0: ");
            sb2.append(i8);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i9 < 0) {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i9);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        int i10 = i7 + i9;
        if (i10 > size()) {
            StringBuilder sb4 = new StringBuilder(34);
            sb4.append("Source end offset < 0: ");
            sb4.append(i10);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        int i11 = i8 + i9;
        if (i11 <= bArr.length) {
            if (i9 > 0) {
                m(i7, i8, i9, bArr);
            }
        } else {
            StringBuilder sb5 = new StringBuilder(34);
            sb5.append("Target end offset < 0: ");
            sb5.append(i11);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
    }

    public abstract void m(int i7, int i8, int i9, byte[] bArr);

    public abstract int o();

    public abstract boolean p();

    public abstract boolean q();

    public abstract int s(int i7, int i8, int i9);

    public abstract int size();

    public abstract int t(int i7, int i8, int i9);

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract int u();

    public abstract String v();

    public final String w() {
        try {
            return v();
        } catch (UnsupportedEncodingException e7) {
            throw new RuntimeException("UTF-8 not supported?", e7);
        }
    }

    public abstract void x(OutputStream outputStream, int i7, int i8);
}
