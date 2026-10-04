package io.ktor.util;

import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001f\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006#"}, d2 = {"Lio/ktor/util/DigestImpl;", "Lio/ktor/util/Digest;", "Ljava/security/MessageDigest;", "delegate", "constructor-impl", "(Ljava/security/MessageDigest;)Ljava/security/MessageDigest;", "", "bytes", "LO3/C;", "plusAssign-impl", "(Ljava/security/MessageDigest;[B)V", "plusAssign", "reset-impl", "(Ljava/security/MessageDigest;)V", "reset", "build-impl", "(Ljava/security/MessageDigest;LS3/c;)Ljava/lang/Object;", "build", "", "toString-impl", "(Ljava/security/MessageDigest;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Ljava/security/MessageDigest;)I", "hashCode", "", "other", "", "equals-impl", "(Ljava/security/MessageDigest;Ljava/lang/Object;)Z", "equals", "Ljava/security/MessageDigest;", "getDelegate", "()Ljava/security/MessageDigest;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class DigestImpl implements Digest {
    private final MessageDigest delegate;

    private /* synthetic */ DigestImpl(MessageDigest messageDigest) {
        this.delegate = messageDigest;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DigestImpl m179boximpl(MessageDigest messageDigest) {
        return new DigestImpl(messageDigest);
    }

    /* renamed from: build-impl, reason: not valid java name */
    public static Object m180buildimpl(MessageDigest messageDigest, S3.c<? super byte[]> cVar) {
        byte[] bArrDigest = messageDigest.digest();
        l.e("digest(...)", bArrDigest);
        return bArrDigest;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static MessageDigest m181constructorimpl(MessageDigest messageDigest) {
        l.f("delegate", messageDigest);
        return messageDigest;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m182equalsimpl(MessageDigest messageDigest, Object obj) {
        return (obj instanceof DigestImpl) && l.a(messageDigest, ((DigestImpl) obj).m188unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m183equalsimpl0(MessageDigest messageDigest, MessageDigest messageDigest2) {
        return l.a(messageDigest, messageDigest2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m184hashCodeimpl(MessageDigest messageDigest) {
        return messageDigest.hashCode();
    }

    /* renamed from: plusAssign-impl, reason: not valid java name */
    public static void m185plusAssignimpl(MessageDigest messageDigest, byte[] bArr) {
        l.f("bytes", bArr);
        messageDigest.update(bArr);
    }

    /* renamed from: reset-impl, reason: not valid java name */
    public static void m186resetimpl(MessageDigest messageDigest) {
        messageDigest.reset();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m187toStringimpl(MessageDigest messageDigest) {
        return "DigestImpl(delegate=" + messageDigest + ')';
    }

    @Override // io.ktor.util.Digest
    public Object build(S3.c<? super byte[]> cVar) {
        return m180buildimpl(this.delegate, cVar);
    }

    public boolean equals(Object obj) {
        return m182equalsimpl(this.delegate, obj);
    }

    public final MessageDigest getDelegate() {
        return this.delegate;
    }

    public int hashCode() {
        return m184hashCodeimpl(this.delegate);
    }

    @Override // io.ktor.util.Digest
    public void plusAssign(byte[] bArr) {
        l.f("bytes", bArr);
        m185plusAssignimpl(this.delegate, bArr);
    }

    @Override // io.ktor.util.Digest
    public void reset() {
        m186resetimpl(this.delegate);
    }

    public String toString() {
        return m187toStringimpl(this.delegate);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ MessageDigest m188unboximpl() {
        return this.delegate;
    }
}
