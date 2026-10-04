package io.ktor.http.content;

import e4.InterfaceC0821a;
import io.ktor.http.content.PartData;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12169k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f12170l;

    public /* synthetic */ c(int i7, Object obj) {
        this.f12169k = i7;
        this.f12170l = obj;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f12169k) {
            case 0:
                return CompressedReadChannelResponse.headers_delegate$lambda$2((CompressedReadChannelResponse) this.f12170l);
            case 1:
                return CompressedWriteChannelResponse.headers_delegate$lambda$2((CompressedWriteChannelResponse) this.f12170l);
            default:
                return MultipartJvmKt._get_streamProvider_$lambda$0((PartData.FileItem) this.f12170l);
        }
    }
}
