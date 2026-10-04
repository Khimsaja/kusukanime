package A5;

import java.util.concurrent.TimeUnit;
import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: l, reason: collision with root package name */
    public static final c f241l;

    /* renamed from: m, reason: collision with root package name */
    public static final c f242m;

    /* renamed from: n, reason: collision with root package name */
    public static final c f243n;

    /* renamed from: o, reason: collision with root package name */
    public static final c f244o;

    /* renamed from: p, reason: collision with root package name */
    public static final c f245p;

    /* renamed from: q, reason: collision with root package name */
    public static final c f246q;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ c[] f247r;

    /* renamed from: k, reason: collision with root package name */
    public final TimeUnit f248k;

    static {
        c cVar = new c("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f241l = cVar;
        c cVar2 = new c("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        c cVar3 = new c("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f242m = cVar3;
        c cVar4 = new c("SECONDS", 3, TimeUnit.SECONDS);
        f243n = cVar4;
        c cVar5 = new c("MINUTES", 4, TimeUnit.MINUTES);
        f244o = cVar5;
        c cVar6 = new c("HOURS", 5, TimeUnit.HOURS);
        f245p = cVar6;
        c cVar7 = new c("DAYS", 6, TimeUnit.DAYS);
        f246q = cVar7;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        f247r = cVarArr;
        AbstractC1420H.z(cVarArr);
    }

    public c(String str, int i7, TimeUnit timeUnit) {
        this.f248k = timeUnit;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f247r.clone();
    }
}
