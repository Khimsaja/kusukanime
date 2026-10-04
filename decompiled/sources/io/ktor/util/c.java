package io.ktor.util;

import e4.n;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12189k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ StringValuesBuilderImpl f12190l;

    public /* synthetic */ c(StringValuesBuilderImpl stringValuesBuilderImpl, int i7) {
        this.f12189k = i7;
        this.f12190l = stringValuesBuilderImpl;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        List list = (List) obj2;
        switch (this.f12189k) {
            case 0:
                return StringValuesBuilderImpl.appendMissing$lambda$1(this.f12190l, str, list);
            default:
                return StringValuesBuilderImpl.appendAll$lambda$0(this.f12190l, str, list);
        }
    }
}
