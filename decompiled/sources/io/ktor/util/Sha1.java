package io.ktor.util;

import P3.m;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0003J'\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u0016\u0010\u001e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u0016\u0010 \u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u0018¨\u0006!"}, d2 = {"Lio/ktor/util/Sha1;", "Lio/ktor/util/HashFunction;", "<init>", "()V", "", "input", "", "pos", "LO3/C;", "processChunk", "([BI)V", "reset", "offset", "length", "update", "([BII)V", "digest", "()[B", "", "messageLength", "J", "unprocessed", "[B", "unprocessedLimit", "I", "", "words", "[I", "h0", "h1", "h2", "h3", "h4", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Sha1 implements HashFunction {
    private long messageLength;
    private int unprocessedLimit;
    private final byte[] unprocessed = new byte[64];
    private final int[] words = new int[80];
    private int h0 = 1732584193;
    private int h1 = -271733879;
    private int h2 = -1732584194;
    private int h3 = 271733878;
    private int h4 = -1009589776;

    private final void processChunk(byte[] input, int pos) {
        int i7;
        int iLeftRotate;
        int i8;
        int[] iArr = this.words;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= 16) {
                break;
            }
            int i11 = pos + 3;
            int i12 = ((input[pos + 1] & 255) << 16) | ((input[pos] & 255) << 24) | ((input[pos + 2] & 255) << 8);
            pos += 4;
            iArr[i10] = i12 | (input[i11] & 255);
            i10++;
        }
        for (i7 = 16; i7 < 80; i7++) {
            iArr[i7] = HashFunctionKt.leftRotate(((iArr[i7 - 3] ^ iArr[i7 - 8]) ^ iArr[i7 - 14]) ^ iArr[i7 - 16], 1);
        }
        int i13 = this.h0;
        int i14 = this.h1;
        int iLeftRotate2 = this.h2;
        int i15 = this.h3;
        int i16 = this.h4;
        while (i9 < 80) {
            if (i9 < 20) {
                iLeftRotate = HashFunctionKt.leftRotate(i13, 5) + (((iLeftRotate2 ^ i15) & i14) ^ i15) + i16 + 1518500249;
                i8 = iArr[i9];
            } else if (i9 < 40) {
                iLeftRotate = HashFunctionKt.leftRotate(i13, 5) + ((i14 ^ iLeftRotate2) ^ i15) + i16 + 1859775393;
                i8 = iArr[i9];
            } else if (i9 < 60) {
                iLeftRotate = ((HashFunctionKt.leftRotate(i13, 5) + (((iLeftRotate2 | i15) & i14) | (iLeftRotate2 & i15))) + i16) - 1894007588;
                i8 = iArr[i9];
            } else {
                iLeftRotate = ((HashFunctionKt.leftRotate(i13, 5) + ((i14 ^ iLeftRotate2) ^ i15)) + i16) - 899497514;
                i8 = iArr[i9];
            }
            int i17 = iLeftRotate + i8;
            i9++;
            i16 = i15;
            i15 = iLeftRotate2;
            iLeftRotate2 = HashFunctionKt.leftRotate(i14, 30);
            i14 = i13;
            i13 = i17;
        }
        this.h0 += i13;
        this.h1 += i14;
        this.h2 += iLeftRotate2;
        this.h3 += i15;
        this.h4 += i16;
    }

    private final void reset() {
        this.messageLength = 0L;
        byte[] bArr = this.unprocessed;
        Arrays.fill(bArr, 0, bArr.length, (byte) 0);
        this.unprocessedLimit = 0;
        m.d0(this.words, 0);
        this.h0 = 1732584193;
        this.h1 = -271733879;
        this.h2 = -1732584194;
        this.h3 = 271733878;
        this.h4 = -1009589776;
    }

    @Override // io.ktor.util.HashFunction
    public byte[] digest() {
        byte[] bArr = this.unprocessed;
        int i7 = this.unprocessedLimit;
        long j7 = this.messageLength * 8;
        int i8 = i7 + 1;
        bArr[i7] = -128;
        if (i8 > 56) {
            Arrays.fill(bArr, i8, 64, (byte) 0);
            processChunk(bArr, 0);
            Arrays.fill(bArr, 0, i8, (byte) 0);
        } else {
            Arrays.fill(bArr, i8, 56, (byte) 0);
        }
        bArr[56] = (byte) (j7 >>> 56);
        bArr[57] = (byte) (j7 >>> 48);
        bArr[58] = (byte) (j7 >>> 40);
        bArr[59] = (byte) (j7 >>> 32);
        bArr[60] = (byte) (j7 >>> 24);
        bArr[61] = (byte) (j7 >>> 16);
        bArr[62] = (byte) (j7 >>> 8);
        bArr[63] = (byte) j7;
        processChunk(bArr, 0);
        int i9 = this.h0;
        int i10 = this.h1;
        int i11 = this.h2;
        int i12 = this.h3;
        int i13 = this.h4;
        reset();
        return new byte[]{(byte) (i9 >> 24), (byte) (i9 >> 16), (byte) (i9 >> 8), (byte) i9, (byte) (i10 >> 24), (byte) (i10 >> 16), (byte) (i10 >> 8), (byte) i10, (byte) (i11 >> 24), (byte) (i11 >> 16), (byte) (i11 >> 8), (byte) i11, (byte) (i12 >> 24), (byte) (i12 >> 16), (byte) (i12 >> 8), (byte) i12, (byte) (i13 >> 24), (byte) (i13 >> 16), (byte) (i13 >> 8), (byte) i13};
    }

    @Override // io.ktor.util.HashFunction
    public void update(byte[] input, int offset, int length) {
        l.f("input", input);
        this.messageLength += length;
        int i7 = offset + length;
        byte[] bArr = this.unprocessed;
        int i8 = this.unprocessedLimit;
        if (i8 > 0) {
            int i9 = length + i8;
            if (i9 < 64) {
                m.U(i8, offset, i7, input, bArr);
                this.unprocessedLimit = i9;
                return;
            } else {
                int i10 = (64 - i8) + offset;
                m.U(i8, offset, i10, input, bArr);
                processChunk(bArr, 0);
                this.unprocessedLimit = 0;
                offset = i10;
            }
        }
        while (offset < i7) {
            int i11 = offset + 64;
            if (i11 > i7) {
                m.U(0, offset, i7, input, bArr);
                this.unprocessedLimit = i7 - offset;
                return;
            } else {
                processChunk(input, offset);
                offset = i11;
            }
        }
    }
}
