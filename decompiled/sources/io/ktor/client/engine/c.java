package io.ktor.client.engine;

import e4.n;
import io.ktor.util.StringValuesKt;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12105k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f12106l;

    public /* synthetic */ c(n nVar, int i7) {
        this.f12105k = i7;
        this.f12106l = nVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        List list = (List) obj2;
        switch (this.f12105k) {
            case 0:
                return UtilsKt.mergeHeaders$lambda$2(this.f12106l, str, list);
            default:
                return StringValuesKt.flattenForEach$lambda$6(this.f12106l, str, list);
        }
    }
}
