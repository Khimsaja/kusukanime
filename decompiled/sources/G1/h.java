package G1;

/* loaded from: classes.dex */
public final class h extends Thread {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ L1.b f2616k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(L1.b bVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f2616k = bVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        do {
            try {
            } catch (InterruptedException e7) {
                throw new IllegalStateException(e7);
            }
        } while (this.f2616k.i());
    }
}
