package W0;

import O3.C;
import android.os.Parcelable;
import android.util.SparseArray;
import e4.InterfaceC0821a;
import io.ktor.util.GzipHeaderFlags;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f9536l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q f9537m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(q qVar, int i7) {
        super(0);
        this.f9536l = i7;
        this.f9537m = qVar;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f9536l) {
            case 0:
                this.f9537m.getLayoutNode().y();
                break;
            case 1:
                q qVar = this.f9537m;
                if (qVar.f9548o && qVar.isAttachedToWindow() && qVar.getView().getParent() == qVar) {
                    qVar.getSnapshotObserver().a(qVar, a.f9514m, qVar.getUpdate());
                }
                break;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                this.f9537m.f9581G.saveHierarchyState(sparseArray);
                break;
            case 3:
                q qVar2 = this.f9537m;
                qVar2.getReleaseBlock().invoke(qVar2.f9581G);
                q.f(qVar2);
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                q qVar3 = this.f9537m;
                qVar3.getResetBlock().invoke(qVar3.f9581G);
                break;
            default:
                q qVar4 = this.f9537m;
                qVar4.getUpdateBlock().invoke(qVar4.f9581G);
                break;
        }
        return C.a;
    }
}
