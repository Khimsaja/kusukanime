package Q4;

import P4.l;
import P4.m;

/* loaded from: classes.dex */
public final class e implements l {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f8014k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f8015l;

    public /* synthetic */ e(g gVar, int i7) {
        this.f8014k = i7;
        this.f8015l = gVar;
    }

    @Override // P4.l, P4.m
    public final void f() {
        int i7 = this.f8014k;
    }

    @Override // P4.l
    public final void g(W4.e eVar, b5.f fVar) {
        int i7 = this.f8014k;
    }

    @Override // P4.l
    public final void j(W4.e eVar, W4.b bVar, W4.e eVar2) {
        int i7 = this.f8014k;
    }

    @Override // P4.l
    public final void k(W4.e eVar, Object obj) {
        switch (this.f8014k) {
            case 0:
                String strB = eVar.b();
                boolean zEquals = "k".equals(strB);
                g gVar = this.f8015l;
                if (!zEquals) {
                    if (!"mv".equals(strB)) {
                        if (!"xs".equals(strB)) {
                            if (!"xi".equals(strB)) {
                                if ("pn".equals(strB) && (obj instanceof String) && !((String) obj).isEmpty()) {
                                    gVar.getClass();
                                    break;
                                }
                            } else if (obj instanceof Integer) {
                                gVar.f8021c = ((Integer) obj).intValue();
                                break;
                            }
                        } else if (obj instanceof String) {
                            String str = (String) obj;
                            if (!str.isEmpty()) {
                                gVar.f8020b = str;
                                break;
                            }
                        }
                    } else if (obj instanceof int[]) {
                        gVar.a = (int[]) obj;
                        break;
                    }
                } else if (obj instanceof Integer) {
                    a.f7994l.getClass();
                    a aVar = (a) a.f7995m.get((Integer) obj);
                    if (aVar == null) {
                        aVar = a.f7996n;
                    }
                    gVar.f8025g = aVar;
                    break;
                }
                break;
            case 1:
                break;
            default:
                String strB2 = eVar.b();
                boolean zEquals2 = "version".equals(strB2);
                g gVar2 = this.f8015l;
                if (!zEquals2) {
                    if ("multifileClassName".equals(strB2)) {
                        gVar2.f8020b = obj instanceof String ? (String) obj : null;
                        break;
                    }
                } else if (obj instanceof int[]) {
                    gVar2.a = (int[]) obj;
                    break;
                }
                break;
        }
    }

    @Override // P4.l
    public final m l(W4.e eVar) {
        switch (this.f8014k) {
            case 0:
                String strB = eVar.b();
                if ("d1".equals(strB)) {
                    return new d(this, 0);
                }
                if ("d2".equals(strB)) {
                    return new d(this, 1);
                }
                return null;
            case 1:
                if ("b".equals(eVar.b())) {
                    return new d(this, 2);
                }
                return null;
            default:
                String strB2 = eVar.b();
                if ("data".equals(strB2) || "filePartClassNames".equals(strB2)) {
                    return new f(this, 0);
                }
                if ("strings".equals(strB2)) {
                    return new f(this, 1);
                }
                return null;
        }
    }

    @Override // P4.l
    public final l n(W4.b bVar, W4.e eVar) {
        switch (this.f8014k) {
        }
        return null;
    }

    private final void e() {
    }

    private final void h() {
    }

    private final void i() {
    }

    private final void a(W4.e eVar, Object obj) {
    }

    private final void b(W4.e eVar, b5.f fVar) {
    }

    private final void c(W4.e eVar, b5.f fVar) {
    }

    private final void d(W4.e eVar, b5.f fVar) {
    }

    private final void m(W4.e eVar, W4.b bVar, W4.e eVar2) {
    }

    private final void o(W4.e eVar, W4.b bVar, W4.e eVar2) {
    }

    private final void p(W4.e eVar, W4.b bVar, W4.e eVar2) {
    }
}
