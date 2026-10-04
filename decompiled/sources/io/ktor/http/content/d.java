package io.ktor.http.content;

import e4.n;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12171k;

    public /* synthetic */ d(int i7) {
        this.f12171k = i7;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        switch (this.f12171k) {
            case 0:
                return Boolean.valueOf(CompressedReadChannelResponse.headers_delegate$lambda$2$lambda$1$lambda$0(str, str2));
            default:
                return Boolean.valueOf(CompressedWriteChannelResponse.headers_delegate$lambda$2$lambda$1$lambda$0(str, str2));
        }
    }
}
