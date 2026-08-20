# Kaggle

## Kaggle MCP Server (Gemini)

Run:

```bash
gemini mcp add --transport http kaggle https://www.kaggle.com/mcp
```

Or add this to `~/.gemini/settings.json`:

```json
{
  "mcpServers": {
    "kaggle": {
      "httpUrl": "https://www.kaggle.com/mcp"
    }
  }
}
```