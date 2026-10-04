package io.ktor.client.request.forms;

import e4.InterfaceC0821a;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12153k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ byte[] f12154l;

    public /* synthetic */ a(Object obj) {
        this.f12154l = (byte[]) obj;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f12153k) {
            case 0:
                return FormDslKt.formData$lambda$9$lambda$4(this.f12154l);
            default:
                return MultiPartFormDataContent.rawParts$lambda$3$lambda$2(this.f12154l);
        }
    }

    public /* synthetic */ a(byte[] bArr) {
        this.f12154l = bArr;
    }
}
