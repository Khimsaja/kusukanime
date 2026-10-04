package X4;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0607d extends OutputStream {

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f9877p = new byte[0];

    /* renamed from: m, reason: collision with root package name */
    public int f9880m;

    /* renamed from: o, reason: collision with root package name */
    public int f9882o;

    /* renamed from: k, reason: collision with root package name */
    public final int f9878k = 128;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f9879l = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public byte[] f9881n = new byte[128];

    public final void b(int i7) {
        this.f9879l.add(new v(this.f9881n));
        int length = this.f9880m + this.f9881n.length;
        this.f9880m = length;
        this.f9881n = new byte[Math.max(this.f9878k, Math.max(i7, length >>> 1))];
        this.f9882o = 0;
    }

    public final void e() {
        int i7 = this.f9882o;
        byte[] bArr = this.f9881n;
        int length = bArr.length;
        ArrayList arrayList = this.f9879l;
        if (i7 >= length) {
            arrayList.add(new v(this.f9881n));
            this.f9881n = f9877p;
        } else if (i7 > 0) {
            byte[] bArr2 = new byte[i7];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i7));
            arrayList.add(new v(bArr2));
        }
        this.f9880m += this.f9882o;
        this.f9882o = 0;
    }

    public final synchronized AbstractC0608e g() {
        ArrayList arrayList;
        e();
        arrayList = this.f9879l;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((AbstractC0608e) it.next());
            }
            arrayList = arrayList2;
        }
        return arrayList.isEmpty() ? AbstractC0608e.f9883k : AbstractC0608e.a(arrayList.iterator(), arrayList.size());
    }

    public final String toString() {
        int i7;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i7 = this.f9880m + this.f9882o;
        }
        return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i7));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i7) {
        try {
            if (this.f9882o == this.f9881n.length) {
                b(1);
            }
            byte[] bArr = this.f9881n;
            int i8 = this.f9882o;
            this.f9882o = i8 + 1;
            bArr[i8] = (byte) i7;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i7, int i8) {
        try {
            byte[] bArr2 = this.f9881n;
            int length = bArr2.length;
            int i9 = this.f9882o;
            if (i8 <= length - i9) {
                System.arraycopy(bArr, i7, bArr2, i9, i8);
                this.f9882o += i8;
            } else {
                int length2 = bArr2.length - i9;
                System.arraycopy(bArr, i7, bArr2, i9, length2);
                int i10 = i8 - length2;
                b(i10);
                System.arraycopy(bArr, i7 + length2, this.f9881n, 0, i10);
                this.f9882o = i10;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
