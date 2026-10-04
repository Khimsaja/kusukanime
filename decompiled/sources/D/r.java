package D;

import B1.AbstractC0015b;
import C2.C0028a;
import H1.C0235p;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Surface;
import android.view.Window;
import androidx.media3.exoplayer.ExoPlayer;
import b1.AbstractC0703b;
import c.InterfaceC0741c;
import d.C0767a;
import d.C0771e;
import d.C0778l;
import f.C0840a;
import f.C0844e;
import f1.AbstractC0870c;
import io.ktor.util.GzipHeaderFlags;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import y.C2302B;
import y.C2306F;
import y.C2337r;
import y1.AbstractC2402y;
import z0.C2461o0;

/* loaded from: classes.dex */
public final class r implements O.G {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1277b;

    public /* synthetic */ r(int i7, Object obj) {
        this.a = i7;
        this.f1277b = obj;
    }

    @Override // O.G
    public final void dispose() {
        Integer num;
        String str;
        boolean z7;
        AbstractC0870c u5;
        int i7 = 7;
        int i8 = 1;
        Object objB = null;
        switch (this.a) {
            case 0:
                ((H.S) this.f1277b).k();
                return;
            case 1:
                L.P0 p02 = (L.P0) this.f1277b;
                p02.dismiss();
                p02.f5296q.e();
                return;
            case 2:
                X0.s sVar = (X0.s) this.f1277b;
                sVar.dismiss();
                sVar.f9737q.e();
                return;
            case 3:
                X0.v vVar = (X0.v) this.f1277b;
                vVar.e();
                vVar.getClass();
                androidx.lifecycle.J.i(vVar, null);
                vVar.f9760x.removeViewImmediate(vVar);
                return;
            case GzipHeaderFlags.EXTRA /* 4 */:
                C0844e c0844e = ((C0767a) this.f1277b).a;
                if (c0844e != null) {
                    c.l lVar = c0844e.f11381k;
                    lVar.getClass();
                    String str2 = c0844e.f11382l;
                    kotlin.jvm.internal.l.f("key", str2);
                    if (!lVar.f11063d.contains(str2) && (num = (Integer) lVar.f11061b.remove(str2)) != null) {
                        lVar.a.remove(num);
                    }
                    lVar.f11064e.remove(str2);
                    LinkedHashMap linkedHashMap = lVar.f11065f;
                    if (linkedHashMap.containsKey(str2)) {
                        StringBuilder sbQ = AbstractC0703b.q("Dropping pending result for request ", str2, ": ");
                        sbQ.append(linkedHashMap.get(str2));
                        Log.w("ActivityResultRegistry", sbQ.toString());
                        linkedHashMap.remove(str2);
                    }
                    Bundle bundle = lVar.f11066g;
                    if (bundle.containsKey(str2)) {
                        if (Build.VERSION.SDK_INT >= 34) {
                            objB = c.h.b(str2, bundle);
                        } else {
                            Object parcelable = bundle.getParcelable(str2);
                            if (C0840a.class.isInstance(parcelable)) {
                                objB = parcelable;
                            }
                        }
                        Log.w("ActivityResultRegistry", "Dropping pending result for request " + str2 + ": " + ((C0840a) objB));
                        bundle.remove(str2);
                    }
                    if (lVar.f11062c.get(str2) != null) {
                        throw new ClassCastException();
                    }
                    objB = O3.C.a;
                }
                if (objB == null) {
                    throw new IllegalStateException("Launcher has not been initialized");
                }
                return;
            case 5:
                Iterator it = ((C0771e) this.f1277b).f11093b.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0741c) it.next()).cancel();
                }
                return;
            case 6:
                Iterator it2 = ((C0778l) this.f1277b).f11093b.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC0741c) it2.next()).cancel();
                }
                return;
            case 7:
                X4.y yVar = (X4.y) this.f1277b;
                if (yVar != null) {
                    ((AbstractC0870c) yVar.f9916l).g0();
                    return;
                }
                return;
            case 8:
                H1.G g4 = (H1.G) ((ExoPlayer) this.f1277b);
                g4.getClass();
                StringBuilder sb = new StringBuilder("Release ");
                sb.append(Integer.toHexString(System.identityHashCode(g4)));
                sb.append(" [AndroidXMedia3/1.6.1] [");
                sb.append(B1.K.f301b);
                sb.append("] [");
                HashSet hashSet = AbstractC2402y.a;
                synchronized (AbstractC2402y.class) {
                    str = AbstractC2402y.f18143b;
                }
                sb.append(str);
                sb.append("]");
                AbstractC0015b.q("ExoPlayerImpl", sb.toString());
                g4.u1();
                g4.f3226K.e();
                g4.f3227L.e(false);
                g4.f3228M.e(false);
                H1.L l7 = g4.f3271v;
                synchronized (l7) {
                    if (l7.f3298N || !l7.f3330t.getThread().isAlive()) {
                        z7 = true;
                    } else {
                        l7.f3328r.e(7);
                        l7.t0(new C0235p(i8, l7), l7.f3291E);
                        z7 = l7.f3298N;
                    }
                }
                if (!z7) {
                    g4.f3272w.e(10, new C0028a(13));
                }
                g4.f3272w.d();
                g4.f3269t.a.removeCallbacksAndMessages(null);
                R1.e eVar = g4.f3221D;
                I1.f fVar = g4.f3219B;
                CopyOnWriteArrayList copyOnWriteArrayList = ((R1.h) eVar).f8051c.a;
                Iterator it3 = copyOnWriteArrayList.iterator();
                while (it3.hasNext()) {
                    R1.c cVar = (R1.c) it3.next();
                    if (cVar.f8036b == fVar) {
                        cVar.f8037c = true;
                        copyOnWriteArrayList.remove(cVar);
                    }
                }
                H1.d0 d0Var = g4.f3264q0;
                if (d0Var.f3440p) {
                    g4.f3264q0 = d0Var.a();
                }
                H1.d0 d0VarD1 = H1.G.d1(g4.f3264q0, 1);
                g4.f3264q0 = d0VarD1;
                H1.d0 d0VarC = d0VarD1.c(d0VarD1.f3426b);
                g4.f3264q0 = d0VarC;
                d0VarC.f3441q = d0VarC.f3443s;
                g4.f3264q0.f3442r = 0L;
                I1.f fVar2 = g4.f3219B;
                B1.F f5 = fVar2.f3959h;
                AbstractC0015b.i(f5);
                f5.c(new B1.w(i7, fVar2));
                g4.j1();
                Surface surface = g4.f3242a0;
                if (surface != null) {
                    surface.release();
                    g4.f3242a0 = null;
                }
                g4.f3252k0 = A1.c.f87b;
                return;
            case 9:
                ((C2337r) this.f1277b).f17638d = null;
                return;
            case 10:
                ((C2306F) this.f1277b).f17577c = null;
                return;
            case 11:
                C2302B c2302b = (C2302B) this.f1277b;
                int iF = c2302b.f17571d.f();
                for (int i9 = 0; i9 < iF; i9++) {
                    c2302b.b();
                }
                return;
            case 12:
                Window window = (Window) this.f1277b;
                if (window != null) {
                    window.getDecorView().setOnFocusChangeListener(null);
                    window.clearFlags(1024);
                    window.getDecorView().setSystemUiVisibility(0);
                    X4.y yVar2 = new X4.y(window.getDecorView());
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 35) {
                        u5 = new i1.V(window, yVar2, 1);
                    } else if (i10 >= 30) {
                        u5 = new i1.T(window, yVar2, 1);
                    } else {
                        u5 = i10 >= 26 ? new i1.U(window, yVar2, 0) : new i1.T(window, yVar2, 0);
                    }
                    u5.g0();
                    return;
                }
                return;
            default:
                ((C2461o0) this.f1277b).a.invoke();
                return;
        }
    }
}
