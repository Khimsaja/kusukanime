package n5;

import io.ktor.http.LinkHeader;
import java.util.ArrayDeque;
import o5.C1705e;
import o5.C1706f;
import o5.InterfaceC1702b;

/* loaded from: classes.dex */
public class L {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13368b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1702b f13369c;

    /* renamed from: d, reason: collision with root package name */
    public final C1705e f13370d;

    /* renamed from: e, reason: collision with root package name */
    public final C1706f f13371e;

    /* renamed from: f, reason: collision with root package name */
    public int f13372f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayDeque f13373g;

    /* renamed from: h, reason: collision with root package name */
    public w5.h f13374h;

    public L(boolean z7, boolean z8, InterfaceC1702b interfaceC1702b, C1705e c1705e, C1706f c1706f) {
        kotlin.jvm.internal.l.f("typeSystemContext", interfaceC1702b);
        kotlin.jvm.internal.l.f("kotlinTypePreparator", c1705e);
        kotlin.jvm.internal.l.f("kotlinTypeRefiner", c1706f);
        this.a = z7;
        this.f13368b = z8;
        this.f13369c = interfaceC1702b;
        this.f13370d = c1705e;
        this.f13371e = c1706f;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f13373g;
        kotlin.jvm.internal.l.c(arrayDeque);
        arrayDeque.clear();
        w5.h hVar = this.f13374h;
        kotlin.jvm.internal.l.c(hVar);
        hVar.clear();
    }

    public final void b() {
        if (this.f13373g == null) {
            this.f13373g = new ArrayDeque(4);
        }
        if (this.f13374h == null) {
            this.f13374h = new w5.h();
        }
    }

    public final a0 c(q5.d dVar) {
        kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, dVar);
        return this.f13370d.a(dVar);
    }

    public final AbstractC1586x d(q5.d dVar) {
        kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, dVar);
        this.f13371e.getClass();
        return (AbstractC1586x) dVar;
    }
}
