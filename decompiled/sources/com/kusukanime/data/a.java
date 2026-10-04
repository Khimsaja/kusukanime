package com.kusukanime.data;

import D3.f;
import O3.C;
import android.content.Context;
import e4.InterfaceC0821a;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11169k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f11170l;

    public /* synthetic */ a(Context context, int i7) {
        this.f11169k = i7;
        this.f11170l = context;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f11169k) {
            case 0:
                return ImgLoader.build$lambda$1(this.f11170l);
            case 1:
                return ImgLoader.build$lambda$2(this.f11170l);
            default:
                f.l(this.f11170l, false);
                return C.a;
        }
    }
}
