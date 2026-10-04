package r1;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import v.c0;

/* renamed from: r1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1863b extends InputStream implements DataInput {

    /* renamed from: k, reason: collision with root package name */
    public final DataInputStream f14809k;

    /* renamed from: l, reason: collision with root package name */
    public int f14810l;

    /* renamed from: m, reason: collision with root package name */
    public ByteOrder f14811m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f14812n;

    /* renamed from: o, reason: collision with root package name */
    public final int f14813o;

    public C1863b(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this(byteArrayInputStream, 0);
        this.f14813o = bArr.length;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f14809k.available();
    }

    public final void b(int i7) throws IOException {
        int i8 = 0;
        while (i8 < i7) {
            DataInputStream dataInputStream = this.f14809k;
            int i9 = i7 - i8;
            int iSkip = (int) dataInputStream.skip(i9);
            if (iSkip <= 0) {
                if (this.f14812n == null) {
                    this.f14812n = new byte[8192];
                }
                iSkip = dataInputStream.read(this.f14812n, 0, Math.min(8192, i9));
                if (iSkip == -1) {
                    throw new EOFException(c0.a(i7, "Reached EOF while skipping ", " bytes."));
                }
            }
            i8 += iSkip;
        }
        this.f14810l += i8;
    }

    @Override // java.io.InputStream
    public final void mark(int i7) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f14810l++;
        return this.f14809k.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f14810l++;
        return this.f14809k.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.f14810l++;
        int i7 = this.f14809k.read();
        if (i7 >= 0) {
            return (byte) i7;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f14810l += 2;
        return this.f14809k.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i7, int i8) throws IOException {
        this.f14810l += i8;
        this.f14809k.readFully(bArr, i7, i8);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.f14810l += 4;
        DataInputStream dataInputStream = this.f14809k;
        int i7 = dataInputStream.read();
        int i8 = dataInputStream.read();
        int i9 = dataInputStream.read();
        int i10 = dataInputStream.read();
        if ((i7 | i8 | i9 | i10) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f14811m;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i10 << 24) + (i9 << 16) + (i8 << 8) + i7;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i7 << 24) + (i8 << 16) + (i9 << 8) + i10;
        }
        throw new IOException("Invalid byte order: " + this.f14811m);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        long j7;
        long j8;
        this.f14810l += 8;
        DataInputStream dataInputStream = this.f14809k;
        int i7 = dataInputStream.read();
        int i8 = dataInputStream.read();
        int i9 = dataInputStream.read();
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        int i13 = dataInputStream.read();
        int i14 = dataInputStream.read();
        if ((i7 | i8 | i9 | i10 | i11 | i12 | i13 | i14) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f14811m;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            j7 = (i14 << 56) + (i13 << 48) + (i12 << 40) + (i11 << 32) + (i10 << 24) + (i9 << 16) + (i8 << 8);
            j8 = i7;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                throw new IOException("Invalid byte order: " + this.f14811m);
            }
            j7 = (i7 << 56) + (i8 << 48) + (i9 << 40) + (i10 << 32) + (i11 << 24) + (i12 << 16) + (i13 << 8);
            j8 = i14;
        }
        return j7 + j8;
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.f14810l += 2;
        DataInputStream dataInputStream = this.f14809k;
        int i7 = dataInputStream.read();
        int i8 = dataInputStream.read();
        if ((i7 | i8) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f14811m;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((i8 << 8) + i7);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (short) ((i7 << 8) + i8);
        }
        throw new IOException("Invalid byte order: " + this.f14811m);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f14810l += 2;
        return this.f14809k.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f14810l++;
        return this.f14809k.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.f14810l += 2;
        DataInputStream dataInputStream = this.f14809k;
        int i7 = dataInputStream.read();
        int i8 = dataInputStream.read();
        if ((i7 | i8) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f14811m;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i8 << 8) + i7;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i7 << 8) + i8;
        }
        throw new IOException("Invalid byte order: " + this.f14811m);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i7) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1863b(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) throws IOException {
        int i9 = this.f14809k.read(bArr, i7, i8);
        this.f14810l += i9;
        return i9;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.f14810l += bArr.length;
        this.f14809k.readFully(bArr);
    }

    public C1863b(InputStream inputStream, int i7) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f14809k = dataInputStream;
        dataInputStream.mark(0);
        this.f14810l = 0;
        this.f14811m = byteOrder;
        this.f14813o = inputStream instanceof C1863b ? ((C1863b) inputStream).f14813o : -1;
    }
}
