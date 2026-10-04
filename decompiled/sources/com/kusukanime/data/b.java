package com.kusukanime.data;

import a6.v;
import e4.k;
import io.github.jan.supabase.auth.AuthImpl;
import io.github.jan.supabase.auth.AuthenticatedSupabaseApiKt;
import io.github.jan.supabase.network.SupabaseApiKt;
import io.ktor.util.GzipHeaderFlags;
import k4.g;
import kotlin.jvm.internal.l;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11171k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f11172l;

    public /* synthetic */ b(String str, int i7) {
        this.f11171k = i7;
        this.f11172l = str;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f11171k) {
            case 0:
                return Boolean.valueOf(SearchHistory.remove$lambda$0(this.f11172l, (String) obj));
            case 1:
                return Boolean.valueOf(SearchHistory.add$lambda$0(this.f11172l, (String) obj));
            case 2:
                return AuthImpl.verifyEmailOtp$lambda$1(this.f11172l, (v) obj);
            case 3:
                return AuthImpl.verifyEmailOtp$lambda$0(this.f11172l, (v) obj);
            case GzipHeaderFlags.EXTRA /* 4 */:
                return AuthImpl.verifyPhoneOtp$lambda$0(this.f11172l, (v) obj);
            case 5:
                return AuthenticatedSupabaseApiKt.authenticatedSupabaseApi$lambda$0(this.f11172l, (String) obj);
            case 6:
                return SupabaseApiKt.supabaseApi$lambda$0(this.f11172l, (String) obj);
            default:
                g gVar = (g) obj;
                l.f("it", gVar);
                return AbstractC2510o.y0(this.f11172l, gVar);
        }
    }
}
