package io.github.jan.supabase.storage.resumable;

import K5.W;
import O3.C;
import S3.c;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u000e\u0010\u000b\u001a\u00020\fH¦@¢\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\u00020\fH¦@¢\u0006\u0002\u0010\rJ\u000e\u0010\u000f\u001a\u00020\fH¦@¢\u0006\u0002\u0010\rR\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0001\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lio/github/jan/supabase/storage/resumable/ResumableUpload;", "", "stateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lio/github/jan/supabase/storage/resumable/ResumableUploadState;", "getStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "fingerprint", "Lio/github/jan/supabase/storage/resumable/Fingerprint;", "getFingerprint-h-pxtCA", "()Ljava/lang/String;", "pause", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "startOrResumeUploading", "Lio/github/jan/supabase/storage/resumable/ResumableUploadImpl;", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ResumableUpload {
    Object cancel(c<? super C> cVar);

    /* renamed from: getFingerprint-h-pxtCA, reason: not valid java name */
    String mo100getFingerprinthpxtCA();

    W getStateFlow();

    Object pause(c<? super C> cVar);

    Object startOrResumeUploading(c<? super C> cVar);
}
