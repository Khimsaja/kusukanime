package q4;

import H4.x;
import P3.r;
import W4.b;
import W4.c;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.l;

/* renamed from: q4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1857a {
    public static final LinkedHashSet a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f14744b;

    static {
        List<c> listI = r.I(x.a, x.f3761h, x.f3762i, x.f3756c, x.f3757d, x.f3759f);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (c cVar : listI) {
            l.f("topLevelFqName", cVar);
            linkedHashSet.add(new b(cVar.b(), cVar.a.g()));
        }
        a = linkedHashSet;
        c cVar2 = x.f3760g;
        l.e("REPEATABLE_ANNOTATION", cVar2);
        f14744b = new b(cVar2.b(), cVar2.a.g());
    }
}
