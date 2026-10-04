package q;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* renamed from: q.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1815C {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14464b;

    /* renamed from: c, reason: collision with root package name */
    public long f14465c = 0;

    /* renamed from: d, reason: collision with root package name */
    public EdgeEffect f14466d;

    /* renamed from: e, reason: collision with root package name */
    public EdgeEffect f14467e;

    /* renamed from: f, reason: collision with root package name */
    public EdgeEffect f14468f;

    /* renamed from: g, reason: collision with root package name */
    public EdgeEffect f14469g;

    /* renamed from: h, reason: collision with root package name */
    public EdgeEffect f14470h;

    /* renamed from: i, reason: collision with root package name */
    public EdgeEffect f14471i;

    /* renamed from: j, reason: collision with root package name */
    public EdgeEffect f14472j;

    /* renamed from: k, reason: collision with root package name */
    public EdgeEffect f14473k;

    public C1815C(Context context, int i7) {
        this.a = context;
        this.f14464b = i7;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? C1832n.a.b(edgeEffect) : 0.0f) == 0.0f);
    }

    public final EdgeEffect a() {
        int i7 = Build.VERSION.SDK_INT;
        Context context = this.a;
        EdgeEffect edgeEffectA = i7 >= 31 ? C1832n.a.a(context, null) : new L(context);
        edgeEffectA.setColor(this.f14464b);
        if (!T0.j.a(this.f14465c, 0L)) {
            long j7 = this.f14465c;
            edgeEffectA.setSize((int) (j7 >> 32), (int) (j7 & 4294967295L));
        }
        return edgeEffectA;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.f14467e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a();
        this.f14467e = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f14468f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a();
        this.f14468f = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.f14469g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a();
        this.f14469g = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.f14466d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a();
        this.f14466d = edgeEffectA;
        return edgeEffectA;
    }
}
