package X4;

import b1.AbstractC0703b;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

/* loaded from: classes.dex */
public class v extends AbstractC0608e {

    /* renamed from: l, reason: collision with root package name */
    public final byte[] f9913l;

    /* renamed from: m, reason: collision with root package name */
    public int f9914m = 0;

    public v(byte[] bArr) {
        this.f9913l = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0608e) || size() != ((AbstractC0608e) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof v) {
            return y((v) obj, 0, size());
        }
        if (obj instanceof B) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        throw new IllegalArgumentException(AbstractC0703b.m(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
    }

    public final int hashCode() {
        int iS = this.f9914m;
        if (iS == 0) {
            int size = size();
            iS = s(size, 0, size);
            if (iS == 0) {
                iS = 1;
            }
            this.f9914m = iS;
        }
        return iS;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new u(this);
    }

    @Override // X4.AbstractC0608e
    public void m(int i7, int i8, int i9, byte[] bArr) {
        System.arraycopy(this.f9913l, i7, bArr, i8, i9);
    }

    @Override // X4.AbstractC0608e
    public final int o() {
        return 0;
    }

    @Override // X4.AbstractC0608e
    public final boolean p() {
        return true;
    }

    @Override // X4.AbstractC0608e
    public final boolean q() {
        byte[] bArr = this.f9913l;
        return F.c(bArr, 0, bArr.length) == 0;
    }

    @Override // X4.AbstractC0608e
    public final int s(int i7, int i8, int i9) {
        for (int i10 = i8; i10 < i8 + i9; i10++) {
            i7 = (i7 * 31) + this.f9913l[i10];
        }
        return i7;
    }

    @Override // X4.AbstractC0608e
    public int size() {
        return this.f9913l.length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r0[r9] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
    
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (r0[r9] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0092, code lost:
    
        if (r0[r8] > (-65)) goto L59;
     */
    @Override // X4.AbstractC0608e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int t(int r8, int r9, int r10) {
        /*
            r7 = this;
            int r10 = r10 + r9
            byte[] r0 = r7.f9913l
            if (r8 == 0) goto L95
            if (r9 < r10) goto L8
            return r8
        L8:
            byte r1 = (byte) r8
            r2 = -1
            r3 = -65
            r4 = -32
            if (r1 >= r4) goto L1f
            r8 = -62
            if (r1 < r8) goto L94
            int r8 = r9 + 1
            r9 = r0[r9]
            if (r9 <= r3) goto L1c
            goto L94
        L1c:
            r9 = r8
            goto L95
        L1f:
            r5 = -16
            if (r1 >= r5) goto L4c
            int r8 = r8 >> 8
            int r8 = ~r8
            byte r8 = (byte) r8
            if (r8 != 0) goto L37
            int r8 = r9 + 1
            r9 = r0[r9]
            if (r8 < r10) goto L34
            int r8 = X4.F.a(r1, r9)
            return r8
        L34:
            r6 = r9
            r9 = r8
            r8 = r6
        L37:
            if (r8 > r3) goto L94
            r5 = -96
            if (r1 != r4) goto L3f
            if (r8 < r5) goto L94
        L3f:
            r4 = -19
            if (r1 != r4) goto L45
            if (r8 >= r5) goto L94
        L45:
            int r8 = r9 + 1
            r9 = r0[r9]
            if (r9 <= r3) goto L1c
            goto L94
        L4c:
            int r4 = r8 >> 8
            int r4 = ~r4
            byte r4 = (byte) r4
            if (r4 != 0) goto L5f
            int r8 = r9 + 1
            r4 = r0[r9]
            if (r8 < r10) goto L5d
            int r8 = X4.F.a(r1, r4)
            return r8
        L5d:
            r9 = 0
            goto L65
        L5f:
            int r8 = r8 >> 16
            byte r8 = (byte) r8
            r6 = r9
            r9 = r8
            r8 = r6
        L65:
            if (r9 != 0) goto L81
            int r9 = r8 + 1
            r8 = r0[r8]
            if (r9 < r10) goto L7e
            r9 = -12
            if (r1 > r9) goto L7d
            if (r4 > r3) goto L7d
            if (r8 <= r3) goto L76
            goto L7d
        L76:
            int r9 = r4 << 8
            r9 = r9 ^ r1
            int r8 = r8 << 16
            r8 = r8 ^ r9
            return r8
        L7d:
            return r2
        L7e:
            r6 = r9
            r9 = r8
            r8 = r6
        L81:
            if (r4 > r3) goto L94
            int r1 = r1 << 28
            int r4 = r4 + 112
            int r4 = r4 + r1
            int r1 = r4 >> 30
            if (r1 != 0) goto L94
            if (r9 > r3) goto L94
            int r9 = r8 + 1
            r8 = r0[r8]
            if (r8 <= r3) goto L95
        L94:
            return r2
        L95:
            int r8 = X4.F.c(r0, r9, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X4.v.t(int, int, int):int");
    }

    @Override // X4.AbstractC0608e
    public final int u() {
        return this.f9914m;
    }

    @Override // X4.AbstractC0608e
    public final String v() {
        byte[] bArr = this.f9913l;
        return new String(bArr, 0, bArr.length, "UTF-8");
    }

    @Override // X4.AbstractC0608e
    public final void x(OutputStream outputStream, int i7, int i8) throws IOException {
        outputStream.write(this.f9913l, i7, i8);
    }

    public final boolean y(v vVar, int i7, int i8) {
        byte[] bArr = vVar.f9913l;
        int length = bArr.length;
        byte[] bArr2 = this.f9913l;
        if (i8 > length) {
            int length2 = bArr2.length;
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i8);
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        int i9 = i7 + i8;
        int length3 = bArr.length;
        byte[] bArr3 = vVar.f9913l;
        if (i9 <= length3) {
            int i10 = 0;
            while (i10 < i8) {
                if (bArr2[i10] != bArr3[i7]) {
                    return false;
                }
                i10++;
                i7++;
            }
            return true;
        }
        int length4 = bArr3.length;
        StringBuilder sb2 = new StringBuilder(59);
        sb2.append("Ran off end of other: ");
        sb2.append(i7);
        sb2.append(", ");
        sb2.append(i8);
        sb2.append(", ");
        sb2.append(length4);
        throw new IllegalArgumentException(sb2.toString());
    }
}
