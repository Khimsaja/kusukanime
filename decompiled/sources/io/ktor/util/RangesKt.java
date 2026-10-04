package io.ktor.util;

import k4.j;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lk4/j;", "other", "", "contains", "(Lk4/j;Lk4/j;)Z", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RangesKt {
    public static final boolean contains(j jVar, j jVar2) {
        l.f("<this>", jVar);
        l.f("other", jVar2);
        return jVar2.f12680k >= jVar.f12680k && jVar2.f12681l <= jVar.f12681l;
    }
}
