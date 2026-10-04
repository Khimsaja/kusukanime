package C2;

import java.util.Arrays;

/* renamed from: C2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0038k {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f764e = {0, 0, 1};
    public boolean a;

    /* renamed from: b, reason: collision with root package name */
    public int f765b;

    /* renamed from: c, reason: collision with root package name */
    public int f766c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f767d;

    public final void a(byte[] bArr, int i7, int i8) {
        if (this.a) {
            int i9 = i8 - i7;
            byte[] bArr2 = this.f767d;
            int length = bArr2.length;
            int i10 = this.f765b + i9;
            if (length < i10) {
                this.f767d = Arrays.copyOf(bArr2, i10 * 2);
            }
            System.arraycopy(bArr, i7, this.f767d, this.f765b, i9);
            this.f765b += i9;
        }
    }
}
