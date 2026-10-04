package C2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f785f = {0, 0, 1};
    public boolean a;

    /* renamed from: b, reason: collision with root package name */
    public int f786b;

    /* renamed from: c, reason: collision with root package name */
    public int f787c;

    /* renamed from: d, reason: collision with root package name */
    public int f788d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f789e;

    public final void a(byte[] bArr, int i7, int i8) {
        if (this.a) {
            int i9 = i8 - i7;
            byte[] bArr2 = this.f789e;
            int length = bArr2.length;
            int i10 = this.f787c + i9;
            if (length < i10) {
                this.f789e = Arrays.copyOf(bArr2, i10 * 2);
            }
            System.arraycopy(bArr, i7, this.f789e, this.f787c, i9);
            this.f787c += i9;
        }
    }
}
