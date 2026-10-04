package d5;

import java.io.Serializable;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.x;
import t4.m;
import t4.r;
import u4.InterfaceC2097c;
import u4.InterfaceC2099e;
import w5.k;

/* loaded from: classes.dex */
public final class d extends k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11328b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Serializable f11329c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11330d;

    public /* synthetic */ d(Object obj, Serializable serializable, int i7) {
        this.f11328b = i7;
        this.f11330d = obj;
        this.f11329c = serializable;
    }

    @Override // w5.k
    public void b(Object obj) {
        switch (this.f11328b) {
            case 0:
                InterfaceC2097c interfaceC2097c = (InterfaceC2097c) obj;
                l.f("current", interfaceC2097c);
                x xVar = (x) this.f11329c;
                if (xVar.f12720k == null && ((Boolean) ((e4.k) this.f11330d).invoke(interfaceC2097c)).booleanValue()) {
                    xVar.f12720k = interfaceC2097c;
                    break;
                }
                break;
        }
    }

    @Override // w5.k
    public final boolean c(Object obj) {
        switch (this.f11328b) {
            case 0:
                l.f("current", (InterfaceC2097c) obj);
                return ((x) this.f11329c).f12720k == null;
            case 1:
                InterfaceC2099e interfaceC2099e = (InterfaceC2099e) obj;
                l.f("javaClassDescriptor", interfaceC2099e);
                String strG = android.support.v4.media.session.b.G(interfaceC2099e, (String) this.f11330d);
                boolean zContains = r.f16085b.contains(strG);
                x xVar = (x) this.f11329c;
                if (zContains) {
                    xVar.f12720k = m.f16067k;
                } else if (r.f16087d.contains(strG)) {
                    xVar.f12720k = m.f16068l;
                } else if (r.f16086c.contains(strG)) {
                    xVar.f12720k = m.f16069m;
                } else if (r.a.contains(strG)) {
                    xVar.f12720k = m.f16071o;
                }
                return xVar.f12720k == null;
            default:
                boolean zBooleanValue = ((Boolean) ((e4.k) this.f11330d).invoke(obj)).booleanValue();
                boolean[] zArr = (boolean[]) this.f11329c;
                if (zBooleanValue) {
                    zArr[0] = true;
                }
                return !zArr[0];
        }
    }

    @Override // w5.k
    public final Object i() {
        switch (this.f11328b) {
            case 0:
                return (InterfaceC2097c) ((x) this.f11329c).f12720k;
            case 1:
                m mVar = (m) ((x) this.f11329c).f12720k;
                return mVar == null ? m.f16070n : mVar;
            default:
                return Boolean.valueOf(((boolean[]) this.f11329c)[0]);
        }
    }

    public d(x xVar, e4.k kVar) {
        this.f11328b = 0;
        this.f11329c = xVar;
        this.f11330d = kVar;
    }
}
