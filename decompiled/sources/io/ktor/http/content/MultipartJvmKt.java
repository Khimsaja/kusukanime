package io.ktor.http.content;

import O3.InterfaceC0554c;
import e4.InterfaceC0821a;
import io.ktor.http.content.PartData;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.jvm.javaio.BlockingKt;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lio/ktor/http/content/PartData$FileItem;", "Lkotlin/Function0;", "Ljava/io/InputStream;", "getStreamProvider", "(Lio/ktor/http/content/PartData$FileItem;)Le4/a;", "getStreamProvider$annotations", "(Lio/ktor/http/content/PartData$FileItem;)V", "streamProvider", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MultipartJvmKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final InputStream _get_streamProvider_$lambda$0(PartData.FileItem fileItem) {
        return BlockingKt.toInputStream$default((ByteReadChannel) fileItem.getProvider().invoke(), null, 1, null);
    }

    public static final InterfaceC0821a getStreamProvider(PartData.FileItem fileItem) {
        l.f("<this>", fileItem);
        return new c(2, fileItem);
    }

    @InterfaceC0554c
    public static /* synthetic */ void getStreamProvider$annotations(PartData.FileItem fileItem) {
    }
}
