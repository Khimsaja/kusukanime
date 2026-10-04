package O;

/* renamed from: O.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0508o {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7108b;

    public /* synthetic */ C0508o(int i7, Object obj) {
        this.a = i7;
        this.f7108b = obj;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                C0510p c0510p = (C0510p) this.f7108b;
                c0510p.f7153z--;
                break;
            default:
                Y.t tVar = (Y.t) this.f7108b;
                tVar.f10024j--;
                break;
        }
    }

    public final void b() {
        switch (this.a) {
            case 0:
                ((C0510p) this.f7108b).f7153z++;
                break;
            default:
                ((Y.t) this.f7108b).f10024j++;
                break;
        }
    }
}
