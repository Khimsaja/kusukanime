package io.github.jan.supabase.auth;

import a6.v;
import e4.k;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12063k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f12064l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f12065m;

    public /* synthetic */ b(String str, String str2, int i7) {
        this.f12063k = i7;
        this.f12064l = str;
        this.f12065m = str2;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        v vVar = (v) obj;
        switch (this.f12063k) {
            case 0:
                return AuthImpl.resendEmail$lambda$0(this.f12064l, this.f12065m, vVar);
            default:
                return AuthImpl.resendPhone$lambda$0(this.f12064l, this.f12065m, vVar);
        }
    }
}
