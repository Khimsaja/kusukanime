package C2;

/* loaded from: classes.dex */
public final class A extends V1.i {
    public static int G(byte[] bArr, int i7) {
        return (bArr[i7 + 3] & 255) | ((bArr[i7] & 255) << 24) | ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7 + 2] & 255) << 8);
    }
}
