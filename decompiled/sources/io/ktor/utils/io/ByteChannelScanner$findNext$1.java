package io.ktor.utils.io;

import U3.c;
import U3.e;
import kotlin.Metadata;

@e(c = "io.ktor.utils.io.ByteChannelScanner", f = "ByteChannelScanner.kt", l = {53, 55, 58, 70}, m = "findNext$ktor_io")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ByteChannelScanner$findNext$1 extends c {
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ByteChannelScanner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteChannelScanner$findNext$1(ByteChannelScanner byteChannelScanner, S3.c<? super ByteChannelScanner$findNext$1> cVar) {
        super(cVar);
        this.this$0 = byteChannelScanner;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.findNext$ktor_io(false, this);
    }
}
