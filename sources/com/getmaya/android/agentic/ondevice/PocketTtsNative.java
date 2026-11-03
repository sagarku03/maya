package com.getmaya.android.agentic.ondevice;

import defpackage.AbstractC1323Qy1;
import java.nio.ByteBuffer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0012\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u0016\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0087 ¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001a\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0087 ¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001d\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0014H\u0087 ¢\u0006\u0004\b\u001d\u0010\u001bJ(\u0010\u001e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0087 ¢\u0006\u0004\b\u001e\u0010\u001fJ`\u0010+\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b+\u0010,J\u0018\u0010-\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b-\u0010\u0019J \u0010.\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0014H\u0087 ¢\u0006\u0004\b.\u0010\u001bJ\u0018\u0010/\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b/\u0010\u0019J(\u00104\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0087 ¢\u0006\u0004\b4\u00105J\u0018\u00106\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b6\u0010\u0010J\u0018\u00107\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b7\u0010\u0010J\u001a\u00108\u001a\u0004\u0018\u00010\u00142\u0006\u0010\t\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b8\u00109J\u001a\u0010:\u001a\u0004\u0018\u00010\u00142\u0006\u0010\t\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b:\u00109J\u0018\u0010<\u001a\u00020\u00062\u0006\u0010;\u001a\u00020'H\u0087 ¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b@\u0010?J\u000f\u0010A\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010E\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bE\u0010DR\u0014\u0010F\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bF\u0010DR\u0014\u0010G\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bG\u0010DR\u0014\u0010H\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bH\u0010DR\u0014\u0010I\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bI\u0010DR\u0014\u0010J\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bJ\u0010DR\u0016\u0010K\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010M\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006O"}, d2 = {"Lcom/getmaya/android/agentic/ondevice/PocketTtsNative;", "", "<init>", "()V", "", "threads", "", "nativeNew", "(I)J", "id", "size", "Ljava/nio/ByteBuffer;", "nativeStage", "(JJ)Ljava/nio/ByteBuffer;", "LGL1;", "nativeUnstage", "(J)V", "graph", "nativeGraphFromStage", "(JI)I", "", "path", "nativeGraphFromFile", "(JILjava/lang/String;)I", "nativeTokenizerFromStage", "(J)I", "nativeTokenizerFromFile", "(JLjava/lang/String;)I", "name", "nativeVoiceFromStage", "nativeVoiceFromFile", "(JLjava/lang/String;Ljava/lang/String;)I", "", "temperature", "eosThreshold", "eosExtraFrames", "firstChunkFrames", "maxChunkFrames", "maxTokensPerChunk", "", "padShortInputs", "appendTerminalPunctuation", "voiceStateCache", "nativeConfigure", "(JFFIIIIZZI)I", "nativeReady", "nativeSetVoice", "nativePrime", "", "utf8", "Lcom/getmaya/android/agentic/ondevice/PcmSink;", "sink", "nativeSpeak", "(J[BLcom/getmaya/android/agentic/ondevice/PcmSink;)I", "nativeCut", "nativeClose", "nativeLastError", "(J)Ljava/lang/String;", "nativeInfo", "peak", "nativeRssKb", "(Z)J", "nativeLiveEngines", "()I", "nativePurge", "load", "()Ljava/lang/String;", "GRAPH_TEXT", "I", "GRAPH_MAIN", "GRAPH_FLOW", "GRAPH_DECODER", "SPOKEN", "CUT", "E_TEXT", "tried", "Z", "failure", "Ljava/lang/String;", "app_release"}, k = 1, mv = {1, 9, 0})
public final class PocketTtsNative {
    public static final int CUT = 0;
    public static final int E_TEXT = -7;
    public static final int GRAPH_DECODER = 3;
    public static final int GRAPH_FLOW = 2;
    public static final int GRAPH_MAIN = 1;
    public static final int GRAPH_TEXT = 0;
    public static final int SPOKEN = 1;
    private static volatile String failure;
    private static volatile boolean tried;
    public static final PocketTtsNative INSTANCE = new PocketTtsNative();
    public static final int $stable = 8;

    private PocketTtsNative() {
    }

    public static final native void nativeClose(long id);

    public static final native int nativeConfigure(long id, float temperature, float eosThreshold, int eosExtraFrames, int firstChunkFrames, int maxChunkFrames, int maxTokensPerChunk, boolean padShortInputs, boolean appendTerminalPunctuation, int voiceStateCache);

    public static final native void nativeCut(long id);

    public static final native int nativeGraphFromFile(long id, int graph, String path);

    public static final native int nativeGraphFromStage(long id, int graph);

    public static final native String nativeInfo(long id);

    public static final native String nativeLastError(long id);

    public static final native int nativeLiveEngines();

    public static final native long nativeNew(int threads);

    public static final native int nativePrime(long id);

    public static final native int nativePurge();

    public static final native int nativeReady(long id);

    public static final native long nativeRssKb(boolean peak);

    public static final native int nativeSetVoice(long id, String name);

    public static final native int nativeSpeak(long id, byte[] utf8, PcmSink sink);

    public static final native ByteBuffer nativeStage(long id, long size);

    public static final native int nativeTokenizerFromFile(long id, String path);

    public static final native int nativeTokenizerFromStage(long id);

    public static final native void nativeUnstage(long id);

    public static final native int nativeVoiceFromFile(long id, String name, String path);

    public static final native int nativeVoiceFromStage(long id, String name);

    public final synchronized String load() {
        String strConcat;
        if (tried) {
            return failure;
        }
        tried = true;
        try {
            System.loadLibrary("onnxruntime");
            System.loadLibrary("pockettts_jni");
            strConcat = null;
        } catch (SecurityException e) {
            strConcat = "library: ".concat(e.getClass().getSimpleName());
        } catch (UnsatisfiedLinkError e2) {
            String message = e2.getMessage();
            if (message == null) {
                message = "";
            }
            strConcat = "library: ".concat(AbstractC1323Qy1.j0(120, message));
        }
        failure = strConcat;
        return failure;
    }
}
