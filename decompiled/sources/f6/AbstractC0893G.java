package f6;

import D6.Q;
import O3.InterfaceC0554c;
import java.io.File;
import w6.InterfaceC2225j;

/* renamed from: f6.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0893G {
    public static final C0892F Companion = new C0892F();

    @InterfaceC0554c
    public static final AbstractC0893G create(C0925w c0925w, File file) {
        Companion.getClass();
        kotlin.jvm.internal.l.f("file", file);
        return new Q(c0925w, file, 1);
    }

    public abstract long contentLength();

    public abstract C0925w contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(InterfaceC2225j interfaceC2225j);

    @InterfaceC0554c
    public static final AbstractC0893G create(C0925w c0925w, String str) {
        Companion.getClass();
        kotlin.jvm.internal.l.f("content", str);
        return C0892F.b(str, c0925w);
    }

    @InterfaceC0554c
    public static final AbstractC0893G create(C0925w c0925w, w6.l lVar) {
        Companion.getClass();
        kotlin.jvm.internal.l.f("content", lVar);
        return new Q(c0925w, lVar, 2);
    }

    @InterfaceC0554c
    public static final AbstractC0893G create(C0925w c0925w, byte[] bArr) {
        Companion.getClass();
        kotlin.jvm.internal.l.f("content", bArr);
        return C0892F.a(c0925w, bArr, 0, bArr.length);
    }

    @InterfaceC0554c
    public static final AbstractC0893G create(C0925w c0925w, byte[] bArr, int i7) {
        Companion.getClass();
        kotlin.jvm.internal.l.f("content", bArr);
        return C0892F.a(c0925w, bArr, i7, bArr.length);
    }

    public static final AbstractC0893G create(String str, C0925w c0925w) {
        Companion.getClass();
        return C0892F.b(str, c0925w);
    }

    public static final AbstractC0893G create(byte[] bArr) {
        C0892F c0892f = Companion;
        c0892f.getClass();
        kotlin.jvm.internal.l.f("<this>", bArr);
        return C0892F.c(c0892f, bArr, null, 0, 7);
    }

    public static final AbstractC0893G create(byte[] bArr, C0925w c0925w) {
        C0892F c0892f = Companion;
        c0892f.getClass();
        kotlin.jvm.internal.l.f("<this>", bArr);
        return C0892F.c(c0892f, bArr, c0925w, 0, 6);
    }

    public static final AbstractC0893G create(byte[] bArr, C0925w c0925w, int i7) {
        C0892F c0892f = Companion;
        c0892f.getClass();
        kotlin.jvm.internal.l.f("<this>", bArr);
        return C0892F.c(c0892f, bArr, c0925w, i7, 4);
    }

    public static final AbstractC0893G create(byte[] bArr, C0925w c0925w, int i7, int i8) {
        Companion.getClass();
        return C0892F.a(c0925w, bArr, i7, i8);
    }

    public static final AbstractC0893G create(w6.l lVar, C0925w c0925w) {
        Companion.getClass();
        kotlin.jvm.internal.l.f("<this>", lVar);
        return new Q(c0925w, lVar, 2);
    }

    public static final AbstractC0893G create(File file, C0925w c0925w) {
        Companion.getClass();
        kotlin.jvm.internal.l.f("<this>", file);
        return new Q(c0925w, file, 1);
    }

    @InterfaceC0554c
    public static final AbstractC0893G create(C0925w c0925w, byte[] bArr, int i7, int i8) {
        Companion.getClass();
        kotlin.jvm.internal.l.f("content", bArr);
        return C0892F.a(c0925w, bArr, i7, i8);
    }
}
