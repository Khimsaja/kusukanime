package M1;

import B1.K;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements y {

    /* renamed from: k, reason: collision with root package name */
    public static final k f6459k = new k();

    /* renamed from: l, reason: collision with root package name */
    public static final k f6460l = new k();

    @Override // M1.y
    public int e(Object obj) {
        String str = ((p) obj).a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (K.a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}
