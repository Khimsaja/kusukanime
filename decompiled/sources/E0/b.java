package E0;

import H5.A;
import O3.C;
import P3.r;
import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import e4.n;
import h0.AbstractC0968M;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final class b extends U3.j implements n {

    /* renamed from: k, reason: collision with root package name */
    public int f1794k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f1795l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScrollCaptureSession f1796m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Rect f1797n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Consumer f1798o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer consumer, S3.c cVar) {
        super(2, cVar);
        this.f1795l = fVar;
        this.f1796m = scrollCaptureSession;
        this.f1797n = rect;
        this.f1798o = consumer;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new b(this.f1795l, this.f1796m, this.f1797n, this.f1798o, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f1794k;
        if (i7 == 0) {
            r.Y(obj);
            ScrollCaptureSession scrollCaptureSession = this.f1796m;
            Rect rect = this.f1797n;
            T0.i iVar = new T0.i(rect.left, rect.top, rect.right, rect.bottom);
            this.f1794k = 1;
            obj = f.a(this.f1795l, scrollCaptureSession, iVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.Y(obj);
        }
        this.f1798o.accept(AbstractC0968M.t((T0.i) obj));
        return C.a;
    }
}
