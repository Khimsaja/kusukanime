package io.ktor.utils.io.core.internal;

import A6.b;
import D6.r;
import b1.AbstractC0703b;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lio/ktor/utils/io/core/internal/CharArraySequence;", "", "", "array", "", "offset", "length", "<init>", "([CII)V", "index", "", "get", "(I)C", "startIndex", "endIndex", "subSequence", "(II)Ljava/lang/CharSequence;", "", "indexOutOfBounds", "(I)Ljava/lang/Void;", "[C", "I", "getLength", "()I", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CharArraySequence implements CharSequence {
    private final char[] array;
    private final int length;
    private final int offset;

    public CharArraySequence(char[] cArr, int i7, int i8) {
        l.f("array", cArr);
        this.array = cArr;
        this.offset = i7;
        this.length = i8;
    }

    private final Void indexOutOfBounds(int index) {
        StringBuilder sbP = AbstractC0703b.p(index, "String index out of bounds: ", " > ");
        sbP.append(this.length);
        throw new IndexOutOfBoundsException(sbP.toString());
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i7) {
        return get(i7);
    }

    public final char get(int index) {
        if (index < this.length) {
            return this.array[index + this.offset];
        }
        indexOutOfBounds(index);
        throw new r();
    }

    public final int getLength() {
        return this.length;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return this.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int startIndex, int endIndex) {
        if (startIndex < 0) {
            throw new IllegalArgumentException(AbstractC0703b.g(startIndex, "startIndex shouldn't be negative: ").toString());
        }
        int i7 = this.length;
        if (startIndex > i7) {
            StringBuilder sbP = AbstractC0703b.p(startIndex, "startIndex is too large: ", " > ");
            sbP.append(this.length);
            throw new IllegalArgumentException(sbP.toString().toString());
        }
        if (startIndex + endIndex <= i7) {
            if (endIndex >= startIndex) {
                return new CharArraySequence(this.array, this.offset + startIndex, endIndex - startIndex);
            }
            throw new IllegalArgumentException(b.e(startIndex, endIndex, "endIndex should be greater or equal to startIndex: ", " > ").toString());
        }
        StringBuilder sbP2 = AbstractC0703b.p(endIndex, "endIndex is too large: ", " > ");
        sbP2.append(this.length);
        throw new IllegalArgumentException(sbP2.toString().toString());
    }
}
