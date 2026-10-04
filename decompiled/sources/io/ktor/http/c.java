package io.ktor.http;

import O.C0525y;
import O3.C;
import e4.InterfaceC0821a;
import io.ktor.util.CryptoKt;
import io.ktor.util.GzipHeaderFlags;
import io.ktor.util.date.DateJvmKt;
import io.ktor.util.debug.IntellijIdeaDebugDetector;
import w1.AbstractC2208a;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12162k;

    public /* synthetic */ c(int i7) {
        this.f12162k = i7;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f12162k) {
            case 0:
                return Cookie._childSerializers$_anonymous_();
            case 1:
                return Cookie._childSerializers$_anonymous_$0();
            case 2:
                return CookieDateParser.parse$lambda$5();
            case 3:
                return CookieDateParser.parse$lambda$6();
            case GzipHeaderFlags.EXTRA /* 4 */:
                return CookieDateParser.parse$lambda$7();
            case 5:
                return CookieDateParser.parse$lambda$8();
            case 6:
                return CookieDateParser.parse$lambda$9();
            case 7:
                return FileContentTypeKt.contentTypesByExtensions_delegate$lambda$1();
            case 8:
                return FileContentTypeKt.extensionsByContentType_delegate$lambda$3();
            case 9:
                return HttpHeaderValueParserKt.parseHeaderValue$lambda$4();
            case 10:
                return HttpHeaderValueParserKt.parseHeaderValueItem$lambda$6();
            case 11:
                return MimesKt.loadMimes();
            case 12:
                return Long.valueOf(DateJvmKt.getTimeMillis());
            case 13:
                return CryptoKt.generateNonce();
            case 14:
                return CryptoKt.generateNonce();
            case 15:
                return Boolean.valueOf(IntellijIdeaDebugDetector.isDebuggerConnected_delegate$lambda$0());
            case 16:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 17:
                return C.a;
            default:
                C0525y c0525y = AbstractC2208a.a;
                return null;
        }
    }
}
