package o3;

import G2.E;
import O3.C;
import e4.InterfaceC0821a;
import io.ktor.util.GzipHeaderFlags;

/* renamed from: o3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1642i implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13616k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E f13617l;

    public /* synthetic */ C1642i(E e7, int i7) {
        this.f13616k = i7;
        this.f13617l = e7;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f13616k) {
            case 0:
                E.m(this.f13617l, "auth", null, 6);
                break;
            case 1:
                this.f13617l.l("me", new io.ktor.network.sockets.b(21));
                break;
            case 2:
                E.m(this.f13617l, "auth", null, 6);
                break;
            case 3:
                this.f13617l.n();
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                E.m(this.f13617l, "auth", null, 6);
                break;
            case 5:
                this.f13617l.n();
                break;
            case 6:
                this.f13617l.l("search", new io.ktor.network.sockets.b(18));
                break;
            case 7:
                E.m(this.f13617l, "auth", null, 6);
                break;
            case 8:
                E.m(this.f13617l, "edit-profile", null, 6);
                break;
            case 9:
                this.f13617l.l("bookmark", new io.ktor.network.sockets.b(16));
                break;
            case 10:
                this.f13617l.l("history", new io.ktor.network.sockets.b(17));
                break;
            case 11:
                this.f13617l.l("settings", new io.ktor.network.sockets.b(22));
                break;
            case 12:
                E.m(this.f13617l, "auth", null, 6);
                break;
            default:
                this.f13617l.l("az", new io.ktor.network.sockets.b(20));
                break;
        }
        return C.a;
    }
}
