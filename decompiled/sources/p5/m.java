package p5;

import io.ktor.http.ContentDisposition;
import java.util.Collection;
import java.util.Set;
import u4.InterfaceC2102h;

/* loaded from: classes.dex */
public final class m extends g {
    @Override // p5.g, g5.o
    public final /* bridge */ /* synthetic */ Collection a(W4.e eVar, C4.c cVar) {
        a(eVar, cVar);
        throw null;
    }

    @Override // p5.g, g5.q
    public final InterfaceC2102h b(W4.e eVar, C4.a aVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        kotlin.jvm.internal.l.f("location", aVar);
        throw new IllegalStateException(this.f14408b + ", required name: " + eVar);
    }

    @Override // p5.g, g5.o
    public final Set c() {
        throw new IllegalStateException();
    }

    @Override // p5.g, g5.o
    public final Set d() {
        throw new IllegalStateException();
    }

    @Override // p5.g, g5.q
    public final Collection e(g5.f fVar, e4.k kVar) {
        kotlin.jvm.internal.l.f("kindFilter", fVar);
        throw new IllegalStateException(this.f14408b);
    }

    @Override // p5.g, g5.o
    public final /* bridge */ /* synthetic */ Collection f(W4.e eVar, C4.a aVar) {
        f(eVar, (C4.c) aVar);
        throw null;
    }

    @Override // p5.g, g5.o
    public final Set g() {
        throw new IllegalStateException();
    }

    @Override // p5.g
    /* renamed from: h */
    public final Set f(W4.e eVar, C4.c cVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        throw new IllegalStateException(this.f14408b + ", required name: " + eVar);
    }

    @Override // p5.g
    /* renamed from: i */
    public final Set a(W4.e eVar, C4.c cVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        throw new IllegalStateException(this.f14408b + ", required name: " + eVar);
    }

    @Override // p5.g
    public final String toString() {
        return A6.b.j(new StringBuilder("ThrowingScope{"), this.f14408b, '}');
    }
}
