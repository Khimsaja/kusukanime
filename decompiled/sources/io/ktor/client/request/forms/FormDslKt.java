package io.ktor.client.request.forms;

import O3.C;
import S5.n;
import e4.InterfaceC0821a;
import e4.k;
import io.ktor.http.ContentDisposition;
import io.ktor.http.ContentType;
import io.ktor.http.HeaderValueWithParametersKt;
import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaders;
import io.ktor.http.content.PartData;
import io.ktor.utils.io.core.ByteReadPacketKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000H\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u001a\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000\"\u0006\u0012\u0002\b\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u0005\u0010\u000b\u001aX\u0010\u0014\u001a\u00020\t*\u00020\b2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0014\b\u0004\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u0007H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0004 \u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001aZ\u0010\u0014\u001a\u00020\t*\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u0007\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0005 \u0001¢\u0006\u0004\b\u0014\u0010\u0019\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001a"}, d2 = {"", "Lio/ktor/client/request/forms/FormPart;", "values", "", "Lio/ktor/http/content/PartData;", "formData", "([Lio/ktor/client/request/forms/FormPart;)Ljava/util/List;", "Lkotlin/Function1;", "Lio/ktor/client/request/forms/FormBuilder;", "LO3/C;", "block", "(Le4/k;)Ljava/util/List;", "", "key", "Lio/ktor/http/Headers;", "headers", "", ContentDisposition.Parameters.Size, "LS5/l;", "bodyBuilder", "append", "(Lio/ktor/client/request/forms/FormBuilder;Ljava/lang/String;Lio/ktor/http/Headers;Ljava/lang/Long;Le4/k;)V", ContentDisposition.Parameters.FileName, "Lio/ktor/http/ContentType;", "contentType", "(Lio/ktor/client/request/forms/FormBuilder;Ljava/lang/String;Ljava/lang/String;Lio/ktor/http/ContentType;Ljava/lang/Long;Le4/k;)V", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FormDslKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    /* renamed from: io.ktor.client.request.forms.FormDslKt$append$1, reason: invalid class name */
    public static final class AnonymousClass1 implements InterfaceC0821a {
        final /* synthetic */ k $bodyBuilder;

        public AnonymousClass1(k kVar) {
            this.$bodyBuilder = kVar;
        }

        @Override // e4.InterfaceC0821a
        public final n invoke() {
            k kVar = this.$bodyBuilder;
            S5.a aVar = new S5.a();
            kVar.invoke(aVar);
            return aVar;
        }
    }

    public static final void append(FormBuilder formBuilder, String str, Headers headers, Long l7, k kVar) {
        l.f("<this>", formBuilder);
        l.f("key", str);
        l.f("headers", headers);
        l.f("bodyBuilder", kVar);
        formBuilder.append(new FormPart(str, new InputProvider(l7, new AnonymousClass1(kVar)), headers));
    }

    public static /* synthetic */ void append$default(FormBuilder formBuilder, String str, Headers headers, Long l7, k kVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            headers = Headers.INSTANCE.getEmpty();
        }
        if ((i7 & 4) != 0) {
            l7 = null;
        }
        l.f("<this>", formBuilder);
        l.f("key", str);
        l.f("headers", headers);
        l.f("bodyBuilder", kVar);
        formBuilder.append(new FormPart(str, new InputProvider(l7, new AnonymousClass1(kVar)), headers));
    }

    public static final List<PartData> formData(FormPart<?>... formPartArr) {
        PartData binaryChannelItem;
        l.f("values", formPartArr);
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        for (FormPart<?> formPart : formPartArr) {
            String strComponent1 = formPart.getKey();
            Object objComponent2 = formPart.component2();
            Headers headersComponent3 = formPart.getHeaders();
            HeadersBuilder headersBuilder = new HeadersBuilder(i7, 1, null);
            HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
            headersBuilder.append(httpHeaders.getContentDisposition(), "form-data; name=" + HeaderValueWithParametersKt.escapeIfNeeded(strComponent1));
            headersBuilder.appendAll(headersComponent3);
            if (objComponent2 instanceof String) {
                binaryChannelItem = new PartData.FormItem((String) objComponent2, new J3.a(24), headersBuilder.build());
            } else if (objComponent2 instanceof Number) {
                binaryChannelItem = new PartData.FormItem(objComponent2.toString(), new J3.a(25), headersBuilder.build());
            } else if (objComponent2 instanceof Boolean) {
                binaryChannelItem = new PartData.FormItem(String.valueOf(((Boolean) objComponent2).booleanValue()), new J3.a(26), headersBuilder.build());
            } else if (objComponent2 instanceof byte[]) {
                headersBuilder.append(httpHeaders.getContentLength(), String.valueOf(((byte[]) objComponent2).length));
                binaryChannelItem = new PartData.BinaryItem(new a(objComponent2), new J3.a(27), headersBuilder.build());
            } else if (objComponent2 instanceof n) {
                if (objComponent2 instanceof S5.a) {
                    headersBuilder.append(httpHeaders.getContentLength(), String.valueOf(ByteReadPacketKt.getRemaining((n) objComponent2)));
                }
                final n nVar = (n) objComponent2;
                final int i8 = 0;
                final int i9 = 1;
                binaryChannelItem = new PartData.BinaryItem(new InterfaceC0821a() { // from class: io.ktor.client.request.forms.b
                    @Override // e4.InterfaceC0821a
                    public final Object invoke() {
                        switch (i8) {
                            case 0:
                                return FormDslKt.formData$lambda$9$lambda$6(nVar);
                            default:
                                return FormDslKt.formData$lambda$9$lambda$7(nVar);
                        }
                    }
                }, new InterfaceC0821a() { // from class: io.ktor.client.request.forms.b
                    @Override // e4.InterfaceC0821a
                    public final Object invoke() {
                        switch (i9) {
                            case 0:
                                return FormDslKt.formData$lambda$9$lambda$6(nVar);
                            default:
                                return FormDslKt.formData$lambda$9$lambda$7(nVar);
                        }
                    }
                }, headersBuilder.build());
            } else if (objComponent2 instanceof InputProvider) {
                InputProvider inputProvider = (InputProvider) objComponent2;
                Long size = inputProvider.getSize();
                if (size != null) {
                    headersBuilder.append(httpHeaders.getContentLength(), size.toString());
                }
                binaryChannelItem = new PartData.BinaryItem(inputProvider.getBlock(), new J3.a(28), headersBuilder.build());
            } else {
                if (!(objComponent2 instanceof ChannelProvider)) {
                    throw new IllegalStateException(("Unknown form content type: " + objComponent2).toString());
                }
                ChannelProvider channelProvider = (ChannelProvider) objComponent2;
                Long size2 = channelProvider.getSize();
                if (size2 != null) {
                    headersBuilder.append(httpHeaders.getContentLength(), size2.toString());
                }
                binaryChannelItem = new PartData.BinaryChannelItem(channelProvider.getBlock(), headersBuilder.build());
            }
            arrayList.add(binaryChannelItem);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n formData$lambda$9$lambda$4(Object obj) {
        return ByteReadPacketKt.ByteReadPacket$default((byte[]) obj, 0, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n formData$lambda$9$lambda$6(Object obj) {
        return ((n) obj).N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C formData$lambda$9$lambda$7(Object obj) throws Exception {
        ((n) obj).close();
        return C.a;
    }

    public static final void append(FormBuilder formBuilder, String str, String str2, ContentType contentType, Long l7, k kVar) {
        l.f("<this>", formBuilder);
        l.f("key", str);
        l.f(ContentDisposition.Parameters.FileName, str2);
        l.f("bodyBuilder", kVar);
        HeadersBuilder headersBuilder = new HeadersBuilder(0, 1, null);
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        headersBuilder.set(httpHeaders.getContentDisposition(), "filename=" + HeaderValueWithParametersKt.escapeIfNeeded(str2));
        if (contentType != null) {
            headersBuilder.set(httpHeaders.getContentType(), contentType.toString());
        }
        formBuilder.append(new FormPart(str, new InputProvider(l7, new AnonymousClass1(kVar)), headersBuilder.build()));
    }

    public static /* synthetic */ void append$default(FormBuilder formBuilder, String str, String str2, ContentType contentType, Long l7, k kVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            contentType = null;
        }
        if ((i7 & 8) != 0) {
            l7 = null;
        }
        append(formBuilder, str, str2, contentType, l7, kVar);
    }

    public static final List<PartData> formData(k kVar) {
        l.f("block", kVar);
        FormBuilder formBuilder = new FormBuilder();
        kVar.invoke(formBuilder);
        FormPart[] formPartArr = (FormPart[]) formBuilder.build$ktor_client_core().toArray(new FormPart[0]);
        return formData((FormPart<?>[]) Arrays.copyOf(formPartArr, formPartArr.length));
    }
}
