package io.ktor.util;

import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u001a/\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001c\u0010\t\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0082\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/ktor/util/HashFunction;", "", "input", "", "offset", "length", "digest", "(Lio/ktor/util/HashFunction;[BII)[B", "bitCount", "leftRotate", "(II)I", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HashFunctionKt {
    public static final byte[] digest(HashFunction hashFunction, byte[] bArr, int i7, int i8) {
        l.f("<this>", hashFunction);
        l.f("input", bArr);
        hashFunction.update(bArr, i7, i8);
        return hashFunction.digest();
    }

    public static /* synthetic */ byte[] digest$default(HashFunction hashFunction, byte[] bArr, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = bArr.length;
        }
        return digest(hashFunction, bArr, i7, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int leftRotate(int i7, int i8) {
        return (i7 >>> (32 - i8)) | (i7 << i8);
    }
}
